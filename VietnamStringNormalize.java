public class VietnamStringNormalize {
    public static String normalize(String input){
        String output = input.toLowerCase();
        output = output
                .replaceAll("/A|Á|À|Ã|Ạ|Â|Ấ|Ầ|Ẫ|Ậ|Ă|Ắ|Ằ|Ẵ|Ặ/","a")
                .replaceAll("/à|á|ạ|ả|ã|â|ầ|ấ|ậ|ẩ|ẫ|ă|ằ|ắ|ặ|ẳ|ẵ/", "a")
                .replaceAll("/è|é|ẹ|ẻ|ẽ|ê|ề|ế|ệ|ể|ễ/", "e")
                .replaceAll("/ì|í|ị|ỉ|ĩ/", "i")
                .replaceAll("/ò|ó|ọ|ỏ|õ|ô|ồ|ố|ộ|ổ|ỗ|ơ|ờ|ớ|ợ|ở|ỡ/", "o")
                .replaceAll("/ù|ú|ụ|ủ|ũ|ư|ừ|ứ|ự|ử|ữ/", "u")
                .replaceAll("/ỳ|ý|ỵ|ỷ|ỹ/", "y")
                .replaceAll("/đ/", "d")
                 // Some system encode vietnamese combining accent as individual utf-8 characters
                .replaceAll("/\u0300|\u0301|\u0303|\u0309|\u0323/", "") // Huyền sắc hỏi ngã nặng
                .replaceAll("/\u02C6|\u0306|\u031B/", ""); // Â, Ê, Ă, Ơ, Ư
        return output;
    }
}
