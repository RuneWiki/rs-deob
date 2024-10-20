package deob;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

@ObfuscatedName("im")
public class class209 {

    @ObfuscatedName("im.aa")
    public class218 field2272;

    @ObfuscatedName("im.au")
    public class220 field2273;

    @ObfuscatedName("im.an")
    public int field2280 = -1;

    @ObfuscatedName("im.ad")
    public String field2267;

    @ObfuscatedName("im.ax")
    public String field2276;

    @ObfuscatedName("im.aw")
    public String field2277;

    @ObfuscatedName("im.az")
    public class115 field2269;

    @ObfuscatedName("im.av")
    public int field2274 = 0;

    @ObfuscatedName("im.am(I)Lia;")
    public class218 method3820() {
        return this.field2272;
    }

    @ObfuscatedName("im.ap(Ljava/lang/String;Ljava/lang/String;Leg;I)Z")
    public boolean method3821(String arg0, String arg1, class113 arg2) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg2 == null) {
            return false;
        } else {
            this.method3881();
            try {
                this.field2267 = arg0;
                this.field2269 = arg2.method2760(new URL(this.field2267));
                this.field2280 = 0;
            } catch (MalformedURLException var5) {
                this.method3881();
                this.field2280 = 4;
                return false;
            }
            if (!arg1.isEmpty()) {
                this.field2277 = arg1;
            }
            return true;
        }
    }

    @ObfuscatedName("im.af(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method3822(String arg0, String arg1, String arg2) {
        this.field2272 = class218.method3348();
        this.field2276 = arg0;
        this.field2272.method3944(this.field2276, arg1, arg2);
    }

    @ObfuscatedName("im.aj(Leg;I)V")
    public void method3823(class113 arg0) {
        switch(this.field2280) {
            case 0:
                this.method3841(arg0);
                break;
            case 1:
                this.method3855();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("im.aq(B)I")
    public int method3824() {
        return this.field2280;
    }

    @ObfuscatedName("im.ar(Ljava/lang/String;I)I")
    public int method3825(String arg0) {
        return this.field2273.field2356.containsKey(arg0) ? (Integer) this.field2273.field2356.get(arg0) : -1;
    }

    @ObfuscatedName("im.ag(Ljava/lang/String;B)Ljava/lang/String;")
    public String method3862(String arg0) {
        return (String) ((String) (this.field2273.field2360.containsKey(arg0) ? this.field2273.field2360.get(arg0) : null));
    }

    @ObfuscatedName("im.ao(S)Ljava/util/ArrayList;")
    public ArrayList method3827() {
        return this.field2273.field2355;
    }

    @ObfuscatedName("im.ae(B)Ljava/util/ArrayList;")
    public ArrayList method3828() {
        return this.field2273.field2358;
    }

    @ObfuscatedName("im.aa(I)Ljava/util/ArrayList;")
    public ArrayList method3829() {
        return this.field2273.field2354;
    }

    @ObfuscatedName("im.au(I)Ljava/lang/String;")
    public String method3819() {
        return this.field2273.field2357;
    }

    @ObfuscatedName("im.an(B)[F")
    public float[] method3831() {
        return this.field2273.field2359;
    }

    @ObfuscatedName("im.ad(S)Ljava/lang/String;")
    public String method3832() {
        return this.field2273.method3978();
    }

    @ObfuscatedName("im.ax(I)V")
    public void method3881() {
        this.field2269 = null;
    }

    @ObfuscatedName("im.aw(Leg;I)V")
    public void method3841(class113 arg0) {
        if (this.field2269 == null || !this.field2269.method2797()) {
            return;
        }
        byte[] var2 = this.field2269.method2798();
        if (var2 == null) {
            this.method3881();
            this.field2280 = 4;
            return;
        }
        try {
            class479 var3 = new class479(var2);
            JSONObject var4 = var3.method7943();
            if (var4 == null) {
                return;
            }
            try {
                this.field2274 = var4.getInt("version");
            } catch (Exception var8) {
                this.method3881();
                this.field2280 = 6;
                return;
            }
            if (this.field2274 < 2) {
                if (!this.field2273.method3981(var4, this.field2274, arg0)) {
                    this.field2280 = 6;
                }
            } else if (this.field2274 == 2) {
                class222 var6 = class222.method7757();
                var6.method4013(var4, this.field2274, arg0);
                this.field2273 = var6.method4016(this.field2277);
                if (this.field2273 == null) {
                    this.field2280 = 7;
                } else {
                    this.method3855();
                    this.field2280 = 1;
                }
            }
        } catch (UnsupportedEncodingException var9) {
            this.method3881();
            this.field2280 = 6;
            return;
        }
        if (this.field2273 != null) {
            this.field2280 = this.field2273.field2355.size() > 0 ? 1 : 2;
        }
        this.field2269 = null;
    }

    @ObfuscatedName("im.az(I)V")
    public void method3855() {
        Iterator var1 = this.field2273.field2355.iterator();
        class210 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field2273.field2355.iterator();
                while (var3.hasNext()) {
                    class210 var4 = (class210) var3.next();
                    if (var4.field2285 != null) {
                        byte[] var5 = var4.field2285.method2798();
                        if (var5 != null && var5.length > 0) {
                            this.field2280 = 2;
                            return;
                        }
                    }
                }
                this.method3881();
                this.field2280 = 5;
                return;
            }
            var2 = (class210) var1.next();
        } while (var2.field2285 == null || var2.field2285.method2797());
    }

    @ObfuscatedName("im.av(Ljava/lang/String;Leg;I)Z")
    public boolean method3869(String arg0, class113 arg1) {
        try {
            JSONObject var3 = (new class479(arg0.getBytes())).method7943();
            try {
                this.field2274 = var3.getInt("version");
            } catch (Exception var6) {
                this.method3881();
                this.field2280 = 6;
                return false;
            }
            if (!this.field2273.method3981(var3, this.field2274, arg1)) {
                this.field2280 = 6;
            }
            this.field2280 = this.field2273.field2355.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var7) {
            this.field2280 = 6;
        }
        return this.field2280 < 3;
    }
}
