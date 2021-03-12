class Cipher{
    constructor(key = 123){
        this.key = key;
        this.delimiter = '-';
        this.store = new Map();
        this.log =  new Map();
    }

    async encode(string){
        const encoded =  string.split('').map(char => char.charCodeAt() * this.key).join(this.delimiter);
        this.store.set(string, encoded);

        this.log.set(new Date().toLocaleString('en-US', { hour12: true}), `"${string}" encoded as "${encoded}"`);
        await new Promise(resolve => setTimeout(resolve, string.length * 100));
        
        return encoded;
    }

    async decode(string){
        const storeEntry = Array.from(this.store.entries()).find(entry => entry[1] === string);
        const decoded = storeEntry && storeEntry[0] || string.split(this.delimiter).map(encodedChar => String.fromCharCode(encodedChar / this.key)).join('');
        
        this.log.set(new Date().toLocaleString('en-US', { hour12: true }), `"${string}" decoded as "${decoded}"`);
        await new Promise (resolve => setTimeout(resolve, string.length*100));
    
        return decoded;
    }

    readLog(){
        this.log.forEach((value, key) => console.log(`${key}:${value}`));
    }
}

async function tester() {
    const cipher = new Cipher(20);
    const encoded = await cipher.encode('DevSchool');

    console.log(encoded);
    console.log(await cipher.decode(encoded));
    cipher.readLog();
}

tester();