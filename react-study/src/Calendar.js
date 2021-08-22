import { useState } from "react";

const Calendar = () => {

    const [dday,setDday] = useState();

    var days = []; // 1부터 31이 들어간 리스트를 만들거임
    for(var i=1 ;i<=31;i++){
        days.push(i)
    }

    var date = new Date(); //오늘의 년-월-일(대한민국표준시) 
    const [today,setToday] = useState(date.getDate());

    function clickDate(i){
        setToday(i)
    }
    
    return ( 
        <div>
            {dday}
            <input value={dday} onChange={(e)=>{setDday(e.target.value)}}></input>

            <div className="cal-con">
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
