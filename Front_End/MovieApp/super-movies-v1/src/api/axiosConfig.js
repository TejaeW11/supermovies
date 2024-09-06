import axios from 'axios';

export default axios.create({
    baseURL:'http://localhost:8080',
    timeout: 50000,
    headers: {"Content-type": "application/json"}
});

// baseURL:'https://superfilmsaga.supermovies.com',
// https://9c96-103-106-239-104.ap.ngrok.io/