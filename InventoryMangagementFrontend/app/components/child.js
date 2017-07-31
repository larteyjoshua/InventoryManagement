import React from 'react';
import axios from 'axios';

import GrandChild from './grandchild';

let productName,productPrice,productWeight;

export default class Child extends React.Component{

    constructor(){
        super();
        this.state={
            tableData:'',
            dataReceived:false,
            fetchingData:false,
            enterData:true,
            productName:'',
            productPrice:'',
            productWeight:''

        }

        this.viewData=this.viewData.bind(this);
        this.enterData=this.enterData.bind(this);
        this.handleProductName=this.handleProductName.bind(this);
        this.handleProductPrice=this.handleProductPrice.bind(this);
        this.handleProductWeight=this.handleProductWeight.bind(this);
        this.sendRequest=this.sendRequest.bind(this);
    }


    viewData(){
        let _this=this;
        console.log("Inside view data")
        this.setState({fetchingData:true,dataReceived:false})
        axios.request({
            method:'post',
            url:'http://localhost:8080/products',

        }).then(function(response){
            console.log(response.data)
            _this.setState({tableData:response.data,fetchingData:false,dataReceived:true})

        })



    }
    enterData(){
        this.setState({enterData:true})
    }
    sendRequest(){
        let data={
            productName:productName,
            productPrice:productPrice,
            productWeight:productWeight
        }
        axios.post("http://localhost:8080/addProducts",data).then(function(response){
            console.log(response)
        })
        console.log(data)
        this.setState({productWeight,productPrice,productName})
        this.viewData();
    }
    handleProductName(e){
        productName=e.target.value

    }
    handleProductPrice(e){
        productPrice=e.target.value

    }
    handleProductWeight(e){
        productWeight=e.target.value

    }
    render(){
        console.log("inside render method")
        console.log(this.state)
        let {tableData,dataReceived}=this.state;
        console.log(tableData )


        return(
            <div>
                <div className="row">
                    <div className="col-md-6 pull-right">
                        <div className="col-md-2"><button onClick={this.viewData}>View Data</button></div>
                        <div className="col-md-2"><button onClick={this.enterData}>Add Data</button></div>
                    </div>

                </div>
                <br/>
                <br/>
                <br/>

                {this.state.enterData && <div className="row">

                    <div><input style={{marginLeft:'800'}} type="textbox" placeholder="Enter product name" onChange={this.handleProductName}/></div>
                    <br/>

                    <div> <input style={{marginLeft:'800'}} type="number" placeholder="Enter product price" onChange={this.handleProductPrice}/></div>
                    <br/>

                    <div><input style={{marginLeft:'800'}} type="number" placeholder="Enter product weight" onChange={this.handleProductWeight}/></div>
                    <br/>

                    <div><button style={{marginLeft:'850'}} onClick={this.sendRequest}>submit</button></div>


                </div>}
                {this.state.fetchingData &&<h5>Loading data.............</h5>}
                {dataReceived && <div className="row">
                    <div className="col-md-12">
                                <table className="table table-bordered">
                                    <tr>
                                        <th>Id</th>
                                        <th>Product Name</th>
                                        <th>Product Price</th>
                                        <th>Product Weight</th>
                                    </tr>
                                    {tableData.map(function(data){
                                        return(<tr>
                                            <td>{data["id"]}</td>
                                            <td>{data["productName"]}</td>
                                            <td>{data["price"]}</td>
                                            <td>{data["weight"]}</td>
                                        </tr>)
                                    })}
                                </table>


                    </div>
                </div>}
            </div>



    )
    }
}