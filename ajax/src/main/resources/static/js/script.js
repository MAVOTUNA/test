function dataSend() {
    let data=$("#userId").val();
    let data2 = 'test';
    let messageDTO={
        result:data ,
        result2 : data2
    };
    $.ajax({
        url: "/ajax/hello",
        data: messageDTO,
        type:"POST",
        dataType : "json"
    }).done(function (div) {
        const data = $.trim(div.test1);
        if(data == '실패') {
            console.log(data);
        }
        // console.log(div.test1);
        $("#resultDiv").replaceWith(div.test1);
    });
}

function test() {
    let elementById = document.getElementById('test');

    let elementById1 = document.getElementById('divtest2');

    elementById1.setAttribute('display' , 'hide');

    let elementById3 = document.getElementById('divtest2');
    console.log(elementById3);
}

function test2() {
    console.log("ddd");
}



