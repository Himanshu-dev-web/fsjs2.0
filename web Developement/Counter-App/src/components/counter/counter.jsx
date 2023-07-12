import React from "react";

let Counter = ({add, sub, double}) => {
    const [counter, setCounter] = React.useState(0);
    let handleCounter = (value) => {
        setCounter(counter + value)
    }
    return (
        <>
            <div className="main container-fluid text-center mt-5">
                <h1 className="text-uppercase text-white ">Counter</h1>
                <div className="text-white display-3 my-4  font-weight-bold ">{counter}</div>
                <button className="btn btn-light mx-2 border border-success" onClick={() => handleCounter(add)}>+</button>
                <button className="btn btn-light  mx-2 border border-primary" onClick={() => handleCounter(sub)}>-</button>
            </div>
            
        </>
    );
}

export default Counter;