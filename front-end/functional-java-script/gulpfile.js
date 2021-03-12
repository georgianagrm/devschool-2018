const gulp = require('gulp');
const del = require('del');
const runSeq = require('run-sequence');

//const connect = require('gulp-connect');
const htmlmin = require('gulp-htmlmin');
const minifyJS = require('gulp-minify');
const minifyCSS = require('gulp-clean-css');

var htmlSource = ['./index.html'],
    cssSource = ['./css/style.css'],
    jsSource = ['./js/script.js'];

gulp.task('html', function() {
    return gulp.src(htmlSource)
        .pipe(htmlmin({
            collapseWhitespace: true,
            caseSensitive: true,
            removeAttributeQuotes: true
        }))
        .pipe(gulp.dest('build/'));
        //.pipe(connect.reload());
});

gulp.task('css', function() {
    return gulp.src(cssSource)
        .pipe(minifyCSS())
        .pipe(gulp.dest('build/'));
        //.pipe(connect.reload());
});

gulp.task('js', function() {
    return gulp.src(jsSource)
        .pipe(minifyJS())
        .pipe(gulp.dest('build/'));
        //.pipe(connect.reload());
});

// gulp.task('connect', function(){
//     connect.server({
//         root: '.',
//         livereload: true
//       })
// });

gulp.task('default', ['html', 'css', 'js']);
