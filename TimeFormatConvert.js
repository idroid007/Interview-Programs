/*
Given a time in

-hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock. 
*/

function timeConversion(s) {
    /*
   * Write your code here.
   */
    let split = s.split(":");
    let m = s.substr(s.length - 2, s.length);


    if (m == "PM") {
        split[0] = 12 + split[0] % 12;
        split[split.length - 1] = split[split.length - 1].substr(0, 2)
    } else if (m == "AM") {
        split[0] = split[0] == "12" ? "00" : split[0];
        split[split.length - 1] = split[split.length - 1].substr(0, 2)
    }

    return split.join(":").toString()

}