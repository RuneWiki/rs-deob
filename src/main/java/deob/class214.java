package deob;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

@ObfuscatedName("is")
public class class214 {

    @ObfuscatedName("is.ai")
    public class223 field2336;

    @ObfuscatedName("is.ae")
    public class225 field2332;

    @ObfuscatedName("is.au")
    public int field2333 = -1;

    @ObfuscatedName("is.ah")
    public String field2331;

    @ObfuscatedName("is.az")
    public String field2335;

    @ObfuscatedName("is.ax")
    public String field2326;

    @ObfuscatedName("is.ac")
    public class119 field2337;

    @ObfuscatedName("is.al")
    public int field2334 = 0;

    @ObfuscatedName("is.aq(I)Lin;")
    public class223 method3818() {
        return this.field2336;
    }

    @ObfuscatedName("is.ad(Ljava/lang/String;Ljava/lang/String;Lea;I)Z")
    public boolean method3819(String arg0, String arg1, class117 arg2) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg2 == null) {
            return false;
        } else {
            this.method3841();
            try {
                this.field2331 = arg0;
                this.field2337 = arg2.method2797(new URL(this.field2331));
                this.field2333 = 0;
            } catch (MalformedURLException var5) {
                this.method3841();
                this.field2333 = 4;
                return false;
            }
            if (!arg1.isEmpty()) {
                this.field2326 = arg1;
            }
            return true;
        }
    }

    @ObfuscatedName("is.ag(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method3820(String arg0, String arg1, String arg2) {
        this.field2336 = class223.method7422();
        this.field2335 = arg0;
        this.field2336.method3950(this.field2335, arg1, arg2);
    }

    @ObfuscatedName("is.ak(Lea;I)V")
    public void method3821(class117 arg0) {
        switch(this.field2333) {
            case 0:
                this.method3836(arg0);
                break;
            case 1:
                this.method3833();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("is.ap(B)I")
    public int method3822() {
        return this.field2333;
    }

    @ObfuscatedName("is.an(Ljava/lang/String;I)I")
    public int method3823(String arg0) {
        return this.field2332.field2413.containsKey(arg0) ? (Integer) this.field2332.field2413.get(arg0) : -1;
    }

    @ObfuscatedName("is.aj(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3824(String arg0) {
        return (String) ((String) (this.field2332.field2409.containsKey(arg0) ? this.field2332.field2409.get(arg0) : null));
    }

    @ObfuscatedName("is.av(B)Ljava/util/ArrayList;")
    public ArrayList method3825() {
        return this.field2332.field2408;
    }

    @ObfuscatedName("is.ab(B)Ljava/util/ArrayList;")
    public ArrayList method3826() {
        return this.field2332.field2407;
    }

    @ObfuscatedName("is.ai(I)Ljava/util/ArrayList;")
    public ArrayList method3827() {
        return this.field2332.field2410;
    }

    @ObfuscatedName("is.ae(I)Ljava/lang/String;")
    public String method3828() {
        return this.field2332.field2404;
    }

    @ObfuscatedName("is.au(I)[F")
    public float[] method3829() {
        return this.field2332.field2411;
    }

    @ObfuscatedName("is.ah(B)Ljava/lang/String;")
    public String method3830() {
        return this.field2332.method3967();
    }

    @ObfuscatedName("is.az(I)V")
    public void method3841() {
        this.field2337 = null;
    }

    @ObfuscatedName("is.ax(Lea;I)V")
    public void method3836(class117 arg0) {
        if (this.field2337 == null || !this.field2337.method2822()) {
            return;
        }
        byte[] var2 = this.field2337.method2823();
        if (var2 == null) {
            this.method3841();
            this.field2333 = 4;
            return;
        }
        try {
            class495 var3 = new class495(var2);
            JSONObject var4 = var3.method8085();
            if (var4 == null) {
                return;
            }
            try {
                this.field2334 = var4.getInt("version");
            } catch (Exception var9) {
                this.method3841();
                this.field2333 = 6;
                return;
            }
            if (this.field2334 < 2) {
                if (!this.field2332.method3962(var4, this.field2334, arg0)) {
                    this.field2333 = 6;
                }
            } else if (this.field2334 == 2) {
                class227 var6 = class227.field2424;
                var6.method4002(var4, this.field2334, arg0);
                this.field2332 = var6.method3995(this.field2326);
                if (this.field2332 == null) {
                    this.field2333 = 7;
                } else {
                    this.method3833();
                    this.field2333 = 1;
                }
            }
        } catch (UnsupportedEncodingException var10) {
            this.method3841();
            this.field2333 = 6;
            return;
        }
        if (this.field2332 != null) {
            this.field2333 = this.field2332.field2408.size() > 0 ? 1 : 2;
        }
        this.field2337 = null;
    }

    @ObfuscatedName("is.ac(I)V")
    public void method3833() {
        Iterator var1 = this.field2332.field2408.iterator();
        class215 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field2332.field2408.iterator();
                while (var3.hasNext()) {
                    class215 var4 = (class215) var3.next();
                    if (var4.field2341 != null) {
                        byte[] var5 = var4.field2341.method2823();
                        if (var5 != null && var5.length > 0) {
                            this.field2333 = 2;
                            return;
                        }
                    }
                }
                this.method3841();
                this.field2333 = 5;
                return;
            }
            var2 = (class215) var1.next();
        } while (var2.field2341 == null || var2.field2341.method2822());
    }

    @ObfuscatedName("is.al(Ljava/lang/String;Lea;S)Z")
    public boolean method3834(String arg0, class117 arg1) {
        try {
            JSONObject var3 = (new class495(arg0.getBytes())).method8085();
            try {
                this.field2334 = var3.getInt("version");
            } catch (Exception var6) {
                this.method3841();
                this.field2333 = 6;
                return false;
            }
            if (!this.field2332.method3962(var3, this.field2334, arg1)) {
                this.field2333 = 6;
            }
            this.field2333 = this.field2332.field2408.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var7) {
            this.field2333 = 6;
        }
        return this.field2333 < 3;
    }
}
