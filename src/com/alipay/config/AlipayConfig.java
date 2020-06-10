package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101500696005";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC5hz3TEgEutC8nrbq0eCkVzFiunIY/2dXwvxBp3KCJ7cuVwcML6QTY2joU+/Icu/yS53wWwrm6aPp5/d4Om5wVV3d+BaxcbZOWOEP7OFk8RchxUJ9lt0BAYKY4tEzdv6dw2pqBwsr4GKPcPH4SqqPrxNUunjWsYOzNLR920PdBEcYC5BnclHrtfIi0MWnB8FseHDLG0xd4uQWglcvMFiE6p6rbUYqcQOsmk1FMKv2eCywyIKtiVTifA1F+v1g1Q5J8Dm5kTfzOEED8vcb8iBFirnMYVTc/gqKmN5baLF2EPueq9JvDsQ3etQ4i8pewYleENgpkRCrZeevWigkJftVRAgMBAAECggEARr0GGaBXyxLwl9Rpx725DJKpjYootde89toiy/pPS8fbQ/JpB/WE35n1Y2Lc4Y/bsbeJXLRKVIUKW9EsBa3XSVvcN7S6D1PIXhJ9+R93BsAkuO/glsvUN7eiKSS12iblFOaE2s0Gzqm2cJawCzX84jxefDPeiyc5otF9mbP7UldqBooXYgjWfEl8g+/5zK0nvQ9fb/qebnEFK7tYs/aVHW/OeQO4Xt/UDhEb6ACsSbOzNxHsuTsyeVd0/U2RtlRjxAVz1otP6jTKkMEBnJKjCgwgaB5WtUhdynfMNKk8HO63IBy4GJJNuBfapHoINprPh/FiPstb0E0xPPZG+XddsQKBgQDnciGhGPVo1FAZGWZyVlJJumE0g8UNblhH511Ec1rT9AjsSXw8xa0xqkp636gLDn+c/Fi4mwATgRf2+1nCuM9B2pGaqKP1NdOo3Vwd3RiXoJNwxs4LFRqQ72T3eQldwSweIwUnjOI6ufZ0can0L1o+KzOKTpRjZV7cNle052GCywKBgQDNNgeLNCY3YNjpQjsRroHJpwc11kYTII2zJJ+MEPvK9db4Lb0Hp4fE+zpFBEDYJT53nk76fdDdmhFmWT5V4wFDeN1A8aSi2eD/K64FwvuWzkj2jgbgj+G00z8RgMybInxupm0Ddz6NiRZuyI2kMbR6hfSA/ARVnZEbkdvSOvcY0wKBgHAgRNaNBueAZEWknpMp6re5SbptVBvLp40+M1skH46rnV8LwtqWUe/LtkWM8RZaMczWHA1jWkgYtIl8/+FsM0yOHRg2NyhmqWIXy7bUFEPxET0Ds3J/CN3KfLm/s5/uI/d9s9OTV05oJVQIdPPNtQSFXXTV2OHGjIxW72q+5ei9AoGAAhd25DhX22ClVVtTds6si/2j2Syh8jf2uci5x5e0uVDgLA9rSdSvUZat9V4huxJGHLoEXBFEO74CR2TJed6ieKmWt76+ytolrPQpBe4C2nqny7uO3mMZDdrJXchOTZaAZjBUFCD3BkJLdD2fE/lduZH7+ASZlrXQcNN/xhjLw/kCgYBWjJfAHXpicJwAvALNXACyfA1ZsxAG6dLRPYFz0eWF6RniwsmbBCox/xtlxDZsE86l6yAeV2CII//9caMJrn88x7DVfIMfdhPoJ+3VrTYxKfBnlkvalDVWmkAFkqLw7hi/RoXueEMHUWOTW3II0xnLkaevEXRh5/5B71lAoQIpEA==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmjqZ+k3+fgF7d9rwTCgQ7l0Q8vATrZ6sz8njObx4GXT57wayH5vFfd6P7yj1l9rFCGOXW9gWUtj2SXGfJRgNweDKVbAoia8VAU5FvSxwPYa4DmKwPeDNdBjO/rWJqxkrZxi4y4Q1inFOWfCs6BzEraAWGSi4KTgWMwJUIzw0rggR68Had/7HxwTybQessKrs2ujaXzEt51ZOfWYYaPwCZbZpDg3/PNhzLFo+1OvOFFEHU6TNM7x0A0I9I82w0zCAlGmka0C2459W5z3g0Yt+Xzv3DwvhkiyEaYBrlQaZRYCECHZPlW2FsIbhrK+8Qd5FW4o0qGmh/Y/gdb6jjUCMHQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	//public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";
	public static String return_url = "http://www.baidu.com";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关   沙箱环境和真实环境的网关区别仅在于alipaydev
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

