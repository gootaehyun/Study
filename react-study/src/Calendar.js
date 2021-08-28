import { useState } from "react";

const Calendar = () => {
    var date = new Date(); //오늘의 년-월-일(대한민국표준시) 
    const [today,setToday] = useState(date.getDate());
    
    //윤달...
    const yoyils = ["SUN","MON","TUE","WEN","THU","FRI","SAT"];
    var mDays = [31,28,31,30,31,30,31,31,30,31,30,31]

    var thisFirst = new Date(date.getFullYear(),date.getMonth(),1)
    //이번달 1일
    var ibundalililsyoyil = thisFirst.getDay();
    //이번달 1일의 요일 (일요일 = 0, 월요일 = 1 ...)
    const thisMonth = date.getMonth();
    const thisYear = date.getFullYear();

    function isLeapYear(year) {
        return (year % 4 === 0 && year % 100 !== 0) || year % 400 === 0;
    }
    if(isLeapYear(thisYear)){
        mDays[1]=29
    }

    var days = []; // 1부터 31이 들어간 리스트를 만들거임
    for(var i=1 ;i<=mDays[thisMonth];i++){
        days.push(i)
    }
    function clickDate(i){
        setToday(i)
    }
    return ( 
        <div className="Calendar-container">
            <div className="cal-month"> {thisMonth+1}월 </div>
            <div className="cal-con">
            {
                yoyils.map((yoyil)=>
                <div className="cal-cell"> {yoyil} </div>
                )
            }
            {
                //빈칸넣기
                Array(ibundalililsyoyil).fill(null).map((i)=>
                <div className="cal-cell"> {"\b"} </div>
                )
            }
            {
                days.map((i)=>
                <div className= {i===today?"cal-cell today":"cal-cell"}
                onClick={()=>clickDate(i)}>{i}</div>) 
            }
            </div>
        </div>
        
    );
}
export default Calendar;
