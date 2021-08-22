import Table from "./Table";
import Calendar from "./Calendar";
import Navbar from "./Navbar";

import {BrowserRouter,Route} from 'react-router-dom';

//S P A - 리액트장점: 속도빠름-> 한페이지 안에서 화면바꿈 ;
//라우터 설치 : npm install --save react-router-dom 

function App() {
  return (
      <div>
        <Navbar></Navbar>
        <BrowserRouter>
            <Route exact path="/"></Route>
            <Route path="/table" component={Table}></Route>
            <Route path="/calendar" component={Calendar}></Route>
        </BrowserRouter>
      </div>
   );
}

export default App;
