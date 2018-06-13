tweets = { //grabs 2 tweets from Wentworth's twitter account: wentworthinst
    loaddata: function () {
        $.ajax({
            url: 'https://api.twitter.com/1.1/statuses/user_timeline.json',
            type: 'GET',
            dataType: 'json',
            data: {
                screen_name: 'wentworthinst',
                include_rts: false,
                count: 2,
                include_entities: true
            },
            success: function (data, text) {
                $('#timeline').append('<li class="tweet">' + tweets(data.text) + '</li>');


            }
        });
    }
};

$(document).ready(function () {
    tweets.loaddata();
});

var oauth = require('oauth.js');

var urlLink = 'https://api.twitter.com/1.1/statuses/update.json';

var twitterStatus = "Sample tweet";

var oauth_consumer_key = "lk6VIr8FwRuDl9ShwfHNUn2Hk";
var consumerSecret = "WabxUF3jl3HIbfvJOTerc3V7Hf8iHPuKMLkiiGo7CxW2zUrYCb";

var oauth_token = "997475892-l1PbQHwgAwCACtQ98HkuYDoHxpTwiv3A6cllEV75";
var tokenSecret = "YYxX1K9LbDbxoV6Md4lW6QDGCaJYDPvABzn1hkMwRQkkmS";

var nonce = oauth.nonce(32);
var ts = Math.floor(new Date().getTime() / 1000);
var timestamp = ts.toString();

var accessor = {
    "consumerSecret": consumerSecret,
    "tokenSecret": tokenSecret
};

var params = {
    "status": twitterStatus,
    "oauth_consumer_key": oauth_consumer_key,
    "oauth_nonce": nonce,
    "oauth_signature_method": "HMAC-SHA1",
    "oauth_timestamp": timestamp,
    "oauth_token": oauth_token,
    "oauth_version": "1.0"
};
var message = {
    "method": "POST",
    "action": urlLink,
    "parameters": params
};
