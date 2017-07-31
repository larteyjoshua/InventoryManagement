import React from 'react';
import Child from './child';
export default class App extends React.Component{
    constructor(props){
        super(props);
    }
    render(){
        return(<div className="content-wrapper">
            <div className="row">

                <div className="col-md-6 pull-right"><h6>Inventory management system</h6></div>
            </div>
            <Child/>

        </div>)
    }
}