# scramblies-api

Luminus and swagger are perhaps overkill, but it is a quick way to get moving and provides all sorts of good stuff that would be useful for a growing project. 

Ad-hoc testing is very easy with swagger and that is sufficient for a simple api like this which is just a wrapper around a tested core project. Anything larger would warrant more careful testing which could be provided outside the API project. Something just running a series of calls to the API and comparing with expected results.

## Running

To start a web server for the application, run:

    lein run 

Then open a browser and point it to localhost:3000/swagger-ui to test or inspect how to call the API from the UI program.

## License

Copyright © 2018 FIXME
