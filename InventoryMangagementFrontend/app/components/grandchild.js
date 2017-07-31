import React from 'react';

export  default class GrandChild extends React.Component{
    render(){
        return(
            <div>
                <h6>From grand child......</h6>
                <h5>{this.props.myName}</h5>
            </div>

        )
    }
}