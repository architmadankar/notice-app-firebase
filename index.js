const express = require('express')
const app = express()

const port = 4000;

function handleListening(){
    console.log('started on http://localhost:'+port);
}

app.listen(port, handleListening);