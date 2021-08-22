import { useState } from "react";

const Calendar = () => {

    const yoyils = ["SUN","MON","TUE","WEN","THU","FRI","SAT"];


    var days = []; // 1부터 31이 들어간 리스트를 만들거임
    for(var i=1 ;i<=31;i++){
        days.push(i)
    }

    var date = new Date("2021-10-23"); //오늘의 년-월-일(대한민국표준시) 
    const [today,setToday] = useState(date.getDate());
    var thisFirst = new Date(date.getFullYear(),date.getMonth(),1)
    //이번달 1일

    var ibundalililsyoyil = thisFirst.getDay();
    //이번달 1일의 요일 (일요일 = 0, 월요일 = 1 ...)

    function clickDate(i){
        setToday(i)
    }
    
    return ( 
        <div>

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
