package deob;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

@ObfuscatedName("ip")
public class class217 {

    @ObfuscatedName("ip.ar")
    public class226 field2363;

    @ObfuscatedName("ip.al")
    public class228 field2365;

    @ObfuscatedName("ip.ad")
    public int field2361 = -1;

    @ObfuscatedName("ip.ah")
    public String field2362;

    @ObfuscatedName("ip.ap")
    public String field2354;

    @ObfuscatedName("ip.ab")
    public String field2364;

    @ObfuscatedName("ip.az")
    public class121 field2359;

    @ObfuscatedName("ip.aa")
    public int field2366 = 0;

    @ObfuscatedName("ip.ac(I)Lib;")
    public class226 method4027() {
        return this.field2363;
    }

    @ObfuscatedName("ip.ae(Ljava/lang/String;Ljava/lang/String;Len;I)Z")
    public boolean method4028(String arg0, String arg1, class119 arg2) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg2 == null) {
            return false;
        } else {
            this.method4026();
            try {
                this.field2362 = arg0;
                this.field2359 = arg2.method2971(new URL(this.field2362));
                this.field2361 = 0;
            } catch (MalformedURLException var5) {
                this.method4026();
                this.field2361 = 4;
                return false;
            }
            if (!arg1.isEmpty()) {
                this.field2364 = arg1;
            }
            return true;
        }
    }

    @ObfuscatedName("ip.ag(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method4029(String arg0, String arg1, String arg2) {
        this.field2363 = class226.method2488();
        this.field2354 = arg0;
        this.field2363.method4138(this.field2354, arg1, arg2);
    }

    @ObfuscatedName("ip.am(Len;B)V")
    public void method4062(class119 arg0) {
        switch(this.field2361) {
            case 0:
                this.method4042(arg0);
                break;
            case 1:
                this.method4043();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("ip.ax(I)I")
    public int method4033() {
        return this.field2361;
    }

    @ObfuscatedName("ip.aq(B)Z")
    public boolean method4057() {
        return this.field2365 != null;
    }

    @ObfuscatedName("ip.af(Ljava/lang/String;I)I")
    public int method4061(String arg0) {
        return this.field2365.field2446.containsKey(arg0) ? (Integer) this.field2365.field2446.get(arg0) : -1;
    }

    @ObfuscatedName("ip.at(Ljava/lang/String;B)Ljava/lang/String;")
    public String method4034(String arg0) {
        return (String) ((String) (this.field2365.field2447.containsKey(arg0) ? this.field2365.field2447.get(arg0) : null));
    }

    @ObfuscatedName("ip.au(I)Ljava/util/ArrayList;")
    public ArrayList method4035() {
        return this.field2365.field2444;
    }

    @ObfuscatedName("ip.ar(B)Ljava/util/ArrayList;")
    public ArrayList method4036() {
        return this.field2365.field2443;
    }

    @ObfuscatedName("ip.al(I)Ljava/util/ArrayList;")
    public ArrayList method4037() {
        return this.field2365.field2441;
    }

    @ObfuscatedName("ip.ad(B)Ljava/lang/String;")
    public String method4030() {
        return this.field2365.field2438;
    }

    @ObfuscatedName("ip.ah(B)[F")
    public float[] method4039() {
        return this.field2365.field2445;
    }

    @ObfuscatedName("ip.ap(I)Ljava/lang/String;")
    public String method4038() {
        return this.field2365.method4187();
    }

    @ObfuscatedName("ip.ab(I)V")
    public void method4026() {
        this.field2359 = null;
    }

    @ObfuscatedName("ip.az(Len;I)V")
    public void method4042(class119 arg0) {
        if (this.field2359 == null || !this.field2359.method2996()) {
            return;
        }
        byte[] var2 = this.field2359.method2997();
        if (var2 == null) {
            this.method4026();
            this.field2361 = 4;
            return;
        }
        try {
            class498 var3 = new class498(var2);
            JSONObject var4 = var3.method8321();
            if (var4 == null) {
                return;
            }
            try {
                this.field2366 = var4.getInt("version");
            } catch (Exception var8) {
                this.method4026();
                this.field2361 = 6;
                return;
            }
            if (this.field2366 < 2) {
                if (!this.field2365.method4175(var4, this.field2366, arg0)) {
                    this.field2361 = 6;
                }
            } else if (this.field2366 == 2) {
                class230 var6 = class230.method4172();
                var6.method4215(var4, this.field2366, arg0);
                this.field2365 = var6.method4218(this.field2364);
                if (this.field2365 == null) {
                    this.field2361 = 7;
                } else {
                    this.method4043();
                    this.field2361 = 1;
                }
            }
        } catch (UnsupportedEncodingException var9) {
            this.method4026();
            this.field2361 = 6;
            return;
        }
        if (this.field2365 != null) {
            this.field2361 = this.field2365.field2444.size() > 0 ? 1 : 2;
        }
        this.field2359 = null;
    }

    @ObfuscatedName("ip.aa(B)V")
    public void method4043() {
        Iterator var1 = this.field2365.field2444.iterator();
        class218 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field2365.field2444.iterator();
                while (var3.hasNext()) {
                    class218 var4 = (class218) var3.next();
                    if (var4.field2370 != null) {
                        byte[] var5 = var4.field2370.method2997();
                        if (var5 != null && var5.length > 0) {
                            this.field2361 = 2;
                            return;
                        }
                    }
                }
                this.method4026();
                this.field2361 = 5;
                return;
            }
            var2 = (class218) var1.next();
        } while (var2.field2370 == null || var2.field2370.method2996());
    }

    @ObfuscatedName("ip.ai(Ljava/lang/String;Len;B)Z")
    public boolean method4044(String arg0, class119 arg1) {
        try {
            JSONObject var3 = (new class498(arg0.getBytes())).method8321();
            try {
                this.field2366 = var3.getInt("version");
            } catch (Exception var6) {
                this.method4026();
                this.field2361 = 6;
                return false;
            }
            if (!this.field2365.method4175(var3, this.field2366, arg1)) {
                this.field2361 = 6;
            }
            this.field2361 = this.field2365.field2444.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var7) {
            this.field2361 = 6;
        }
        return this.field2361 < 3;
    }
}
