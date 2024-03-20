# 1xx Informationnel

| Code | Description |
|------|-------------|
| 100  | Continue |
| 101  | Switching Protocols |
| 102  | Processing (WebDAV) |


# 2xx Succès

| Code | Description |
|------|-------------|
| 200  | OK |
| 201  | Created |
| 202  | Accepted |
| 203  | Non-Authoritative Information |
| 204  | No Content |
| 205  | Reset Content |
| 206  | Partial Content |
| 207  | Multi-Status (WebDAV) |
| 208  | Already Reported (WebDAV) |
| 226  | IM Used |

# 3xx Redirection

| Code | Description |
|------|-------------|
| 300  | Multiple Choices |
| 301  | Moved Permanently |
| 302  | Found |
| 303  | See Other |
| 304  | Not Modified |
| 305  | Use Proxy |
| 307  | Temporary Redirect |
| 308  | Permanent Redirect (expérimental) |

# 4xx Erreur Client

| Code | Description |
|------|-------------|
| 400  | Bad Request |
| 401  | Unauthorized |
| 402  | Payment Required |
| 403  | Forbidden |
| 404  | Not Found |
| 405  | Method Not Allowed |
| 406  | Not Acceptable |
| 407  | Proxy Authentication Required |
| 408  | Request Timeout |
| 409  | Conflict |
| 410  | Gone |
| 411  | Length Required |
| 412  | Precondition Failed |
| 413  | Request Entity Too Large |
| 414  | Request-URI Too Long |
| 415  | Unsupported Media Type |
| 416  | Requested Range Not Satisfiable |
| 417  | Expectation Failed |
| 418  | I'm a teapot (RFC 2324) |
| 420  | Enhance Your Calm (Twitter) |
| 422  | Unprocessable Entity (WebDAV) |
| 423  | Locked (WebDAV) |
| 424  | Failed Dependency (WebDAV) |
| 425  | Reserved for WebDAV |
| 426  | Upgrade Required |
| 428  | Precondition Required |
| 429  | Too Many Requests |
| 431  | Request Header Fields Too Large |
| 444  | No Response (Nginx) |
| 449  | Retry With (Microsoft) |
| 450  | Blocked by Windows Parental Controls (Microsoft) |
| 451  | Unavailable For Legal Reasons |
| 499  | Client Closed Request (Nginx) |

# 5xx Erreur Serveur

| Code | Description |
|------|-------------|
| 500  | Internal Server Error |
| 501  | Not Implemented |
| 502  | Bad Gateway |
| 503  | Service Unavailable |
| 504  | Gateway Timeout |
| 505  | HTTP Version Not Supported |
| 506  | Variant Also Negotiates (Expérimental) |
| 507  | Insufficient Storage (WebDAV) |
| 508  | Loop Detected (WebDAV) |
| 509  | Bandwidth Limit Exceeded (Apache) |
| 510  | Not Extended |
| 511  | Network Authentication Required |
| 598  | Network read timeout error |
| 599  | Network connect timeout error |


# Top 10 HTTP Status Codes

| Code | Description | REST Service-Specific Information |
|------|-------------|-----------------------------------|
| 200  | OK | The request has been successfully processed. |
| 201  | Created | The request has been successfully processed, and a new resource has been created. |
| 204  | No Content | The request has been successfully processed but does not return any content. |
| 304  | Not Modified | The resource has not been modified since the last request. |
| 400  | Bad Request | The request is malformed or cannot be processed by the server. |
| 401  | Unauthorized | Access to the resource requires authentication. |
| 403  | Forbidden | Access to the resource is forbidden for the current user. |
| 404  | Not Found | The requested resource was not found on the server. |
| 409  | Conflict | The request cannot be processed due to a conflict with the current state of the resource. |
| 500  | Internal Server Error | An internal server error occurred, preventing the request from being processed. |
