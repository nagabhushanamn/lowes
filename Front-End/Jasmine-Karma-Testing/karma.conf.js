// Karma configuration
// Generated on Tue Aug 01 2017 12:08:43 GMT+0530 (IST)

module.exports = function(config) {
	config.set({

		// base path that will be used to resolve all patterns (eg. files, exclude)
		basePath : '',


		// frameworks to use
		// available frameworks: https://npmjs.org/browse/keyword/karma-adapter
		frameworks : [ 'jasmine' ],


		// list of files / patterns to load in the browser
		files : [
			'angular-1.5.1/angular.js', // ng core module
			'angular-1.5.1/angular-resource.js', 
			'angular-1.5.1/angular-route.js', 
			'angular-1.5.1/angular-mocks.js', // for ng unit-testing
			'src/**/*.js',
			'spec/**/*.js'
		],


		// list of files to exclude
		exclude : [],


		// preprocess matching files before serving them to the browser
		// available preprocessors: https://npmjs.org/browse/keyword/karma-preprocessor
		preprocessors : {
			'src/**/*.js' : [ 'coverage' ],
		},


		// test results reporter to use
		// possible values: 'dots', 'progress'
		// available reporters: https://npmjs.org/browse/keyword/karma-reporter
		reporters : [ 'progress', 'coverage', 'junit' ],


		// web server port
		port : 9876,


		// enable / disable colors in the output (reporters and logs)
		colors : true,


		// level of logging
		// possible values: config.LOG_DISABLE || config.LOG_ERROR || config.LOG_WARN || config.LOG_INFO || config.LOG_DEBUG
		logLevel : config.LOG_INFO,


		// enable / disable watching file and executing tests whenever any file changes
		autoWatch : true,


		// start these browsers
		// available browser launchers: https://npmjs.org/browse/keyword/karma-launcher
		browsers : [ 'PhantomJS' ],


		// Continuous Integration mode
		// if true, Karma captures browsers, runs the tests and exits
		singleRun : false,

		// Concurrency level
		// how many browser should be started simultaneous
		concurrency : Infinity,
		coverageReporter : {
			type : 'html',
			dir : 'coverage/'
		},
		junitReporter : {
			outputDir : '', // results will be saved as $outputDir/$browserName.xml 
			outputFile : undefined, // if included, results will be saved as $outputDir/$browserName/$outputFile 
			suite : '', // suite will become the package name attribute in xml testsuite element 
			useBrowserName : true, // add browser name to report and classes names 
			nameFormatter : undefined, // function (browser, result) to customize the name attribute in xml testcase element 
			classNameFormatter : undefined, // function (browser, result) to customize the classname attribute in xml testcase element 
			properties : {} // key value pair of properties to add to the <properties> section of the report 
		}
	})
}