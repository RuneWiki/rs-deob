package deob;

import java.util.ArrayList;
import java.util.Arrays;

@ObfuscatedName("cw")
public class class74 {

    @ObfuscatedName("cw.ap")
    public final ArrayList field879 = new ArrayList(1);

    @ObfuscatedName("cw.aw")
    public int field882 = -1;

    @ObfuscatedName("cw.ak")
    public int field873 = 0;

    @ObfuscatedName("cw.aj")
    public class351 field874 = new class351();

    @ObfuscatedName("cw.ai")
    public byte field875;

    @ObfuscatedName("cw.ay")
    public int field876 = 0;

    @ObfuscatedName("cw.as")
    public int field877 = -1;

    @ObfuscatedName("cw.ae")
    public int field881 = -1;

    @ObfuscatedName("cw.am")
    public class276 field878;

    @ObfuscatedName("cw.at")
    public class558 field880;

    @ObfuscatedName("cw.au")
    public String[] field872 = new String[3];

    public class74(int arg0) {
        this.field882 = arg0;
        for (int var2 = 0; var2 < 3; var2++) {
            this.field872[var2] = "";
        }
    }

    @ObfuscatedName("cw.ap(I)V")
    public void method2160() {
        this.field880 = null;
        this.field879.clear();
    }

    @ObfuscatedName("cw.aw(II)V")
    public void method2175(int arg0) {
        this.field873 = arg0;
        this.field876 = 0;
        this.field877 = -1;
        this.field881 = -1;
        this.field875 = 0;
        this.field878 = class276.field3049;
        this.field880 = null;
    }

    @ObfuscatedName("cw.ak(Ldv;I)V")
    public void method2162(class95 arg0) {
        this.field879.add(arg0);
    }

    @ObfuscatedName("cw.aj(Ldv;I)V")
    public void method2163(class95 arg0) {
        this.field879.remove(arg0);
    }

    @ObfuscatedName("cw.ai(ILdn;I)Ldv;")
    public class95 method2164(int arg0, class104 arg1) {
        class95 var3 = new class95();
        var3.field1162 = arg0;
        if (this.field880 != null) {
            var3.method2507(this.field880);
        }
        var3.field1284 = this.field876;
        var3.field1241 = this.field881;
        var3.field1230[0] = this.field878;
        var3.field1148 = this.field874.field3779;
        var3.field1146 = arg1;
        var3.field1140 = this.field872;
        var3.method2523(this.field874.field3777 - arg1.field1347, this.field874.field3778 - arg1.field1348);
        return var3;
    }

    @ObfuscatedName("cw.ay(I)Z")
    public boolean method2165() {
        return this.field873 == -1;
    }

    @ObfuscatedName("cw.as(I)V")
    public void method2187() {
        this.field873 = this.field874.method6255();
    }

    @ObfuscatedName("cw.ae(IIB)V")
    public void method2232(int arg0, int arg1) {
        this.field874.method6288(this.field873, arg0, arg1);
        this.field873 = -1;
    }

    @ObfuscatedName("cw.am(I)I")
    public int method2168() {
        return this.field874.field3779;
    }

    @ObfuscatedName("cw.at(II)V")
    public void method2169(int arg0) {
        this.field874.field3779 = arg0;
    }

    @ObfuscatedName("cw.au(Lkk;I)V")
    public void method2170(class276 arg0) {
        for (int var2 = 0; var2 < this.field879.size(); var2++) {
            class95 var3 = (class95) this.field879.get(var2);
            class104 var4 = var3.field1146;
            int var5 = this.field874.field3777 - var4.field1347;
            int var6 = this.field874.field3778 - var4.field1348;
            class276 var7 = arg0;
            boolean var8 = true;
            boolean var9 = true;
            if (Statics.field194 == var3 && (var3.field1247 < 1536 || var3.field1270 < 1536 || var3.field1247 >= 11776 || var3.field1270 >= 11776)) {
                var7 = class276.field3053;
            }
            var3.field1148 = this.field874.field3779;
            if (class276.field3053 == var7) {
                var3.method2523(var5, var6);
            } else {
                var3.method2518(var4, var5, var6, var7);
            }
        }
    }

    @ObfuscatedName("cw.an(Lvl;B)V")
    public void method2178(class558 arg0) {
        this.field880 = arg0;
        for (int var2 = 0; var2 < this.field879.size(); var2++) {
            ((class95) this.field879.get(var2)).method2507(this.field880);
        }
    }

    @ObfuscatedName("cw.ao(IIB)V")
    public void method2213(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field879.size(); var3++) {
            client.method7210((class95) this.field879.get(var3), arg0, arg1);
        }
    }

    @ObfuscatedName("cw.af(IB)V")
    public void method2173(int arg0) {
        this.field881 = arg0;
        for (int var2 = 0; var2 < this.field879.size(); var2++) {
            ((class100) this.field879.get(var2)).field1241 = arg0;
        }
    }

    @ObfuscatedName("cw.ar(Ljava/lang/String;I)V")
    public void method2208(String arg0) {
        String var2 = "";
        for (int var3 = 0; var3 < this.field879.size(); var3++) {
            class95 var4 = (class95) this.field879.get(var3);
            var4.field1239 = false;
            var4.field1242 = 0;
            var4.field1243 = 0;
            var4.field1231 = 150;
            var4.field1252 = arg0;
            var2 = var4.field1141.method9989();
        }
        if (arg0.charAt(0) == '~') {
            String var5 = arg0.substring(1);
            Statics.method7725(2, var2, var5);
        } else if (client.field630 == this.field882) {
            Statics.method7725(2, var2, arg0);
        }
    }

    @ObfuscatedName("cw.ab(IIIIII)V")
    public void method2242(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = 0; var6 < this.field879.size(); var6++) {
            ((class100) this.field879.get(var6)).method2622(arg0, arg1, arg2, arg3, client.field518, arg4);
        }
    }

    @ObfuscatedName("cw.az(IIIIII)V")
    public void method2176(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = 0; var6 < this.field879.size(); var6++) {
            ((class100) this.field879.get(var6)).method2623(arg0, client.field518, arg1, arg2, arg3, arg4);
        }
    }

    @ObfuscatedName("cw.ag(II)V")
    public void method2177(int arg0) {
        for (int var2 = 0; var2 < this.field879.size(); var2++) {
            ((class100) this.field879.get(var2)).method2650(arg0);
        }
    }

    @ObfuscatedName("cw.ad(II)V")
    public void method2226(int arg0) {
        this.field877 = arg0;
        for (int var2 = 0; var2 < this.field879.size(); var2++) {
            class95 var3 = (class95) this.field879.get(var2);
            var3.field1254 = this.field877;
            if (var3.field1256 == 0) {
                var3.field1284 = this.field877;
                var3.method2628();
            }
        }
    }

    @ObfuscatedName("cw.ac(ILoo;ZLjava/lang/String;[BI)V")
    public void method2179(int arg0, class386 arg1, boolean arg2, String arg3, byte[] arg4) {
        boolean var6 = false;
        String var7 = null;
        for (int var8 = 0; var8 < this.field879.size(); var8++) {
            class95 var9 = (class95) this.field879.get(var8);
            if (var9.field1141 != null && var9.field1136 != null) {
                boolean var10 = false;
                if (arg1.field4525 && Statics.field1072.method1929(var9.field1141)) {
                    var10 = true;
                }
                if (!var10 && client.field628 == 0 && !var9.field1142) {
                    var6 = true;
                    var7 = var9.field1141.method9989();
                    var9.field1252 = arg3.trim();
                    var9.field1242 = arg0 >> 8;
                    var9.field1243 = arg0 & 0xFF;
                    var9.field1231 = 150;
                    var9.field1244 = class582.method8332(arg4);
                    var9.field1239 = arg2;
                    var9.field1240 = Statics.field3772 != var9 && arg1.field4525 && !client.field731.isEmpty() && arg3.toLowerCase().indexOf(client.field731) == -1;
                }
            }
        }
        if (!var6 || var7 == null) {
            return;
        }
        int var11;
        if (arg1.field4524) {
            var11 = arg2 ? 91 : 1;
        } else {
            var11 = arg2 ? 90 : 2;
        }
        if (arg1.field4523 == -1) {
            Statics.method7725(var11, var7, arg3);
        } else {
            Statics.method7725(var11, class107.method2432(arg1.field4523) + var7, arg3);
        }
    }

    @ObfuscatedName("cw.av(IIIIIIIZI)V")
    public void method2181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        for (int var9 = 0; var9 < this.field879.size(); var9++) {
            class95 var10 = (class95) this.field879.get(var9);
            var10.field1269 = arg0;
            var10.field1229 = arg1;
            var10.field1287 = arg2;
            var10.field1272 = arg3;
            var10.field1271 = arg4;
            var10.field1274 = arg5;
            var10.field1224 = arg6;
            if (arg7) {
                class104 var11 = var10.field1146;
                int var12 = this.field874.field3777 - var11.field1347;
                int var13 = this.field874.field3778 - var11.field1348;
                var10.field1269 += var12;
                var10.field1229 += var13;
                var10.field1287 += var12;
                var10.field1272 += var13;
                var10.field1256 = 0;
            } else {
                var10.field1269 += var10.field1288[0];
                var10.field1229 += var10.field1234[0];
                var10.field1287 += var10.field1288[0];
                var10.field1272 += var10.field1234[0];
                var10.field1256 = 1;
            }
            var10.field1292 = 0;
        }
    }

    @ObfuscatedName("cw.ax([Ljava/lang/String;I)V")
    public void method2229(String[] arg0) {
        this.field872 = (String[]) ((String[]) Arrays.copyOf(arg0, arg0.length));
        for (int var2 = 0; var2 < this.field879.size(); var2++) {
            ((class95) this.field879.get(var2)).field1140 = (String[]) ((String[]) Arrays.copyOf(arg0, arg0.length));
        }
    }

    @ObfuscatedName("cw.aq(IIBBBBI)V")
    public void method2234(int arg0, int arg1, byte arg2, byte arg3, byte arg4, byte arg5) {
        for (int var7 = 0; var7 < this.field879.size(); var7++) {
            class95 var8 = (class95) this.field879.get(var7);
            var8.field1278 = arg0;
            var8.field1279 = arg1;
            var8.field1277 = arg2;
            var8.field1281 = arg3;
            var8.field1282 = arg4;
            var8.field1283 = arg5;
        }
    }

    @ObfuscatedName("cw.al(IIIIB)V")
    public void method2183(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field879.size(); var5++) {
            ((class100) this.field879.get(var5)).method2624(arg0, arg1, arg2, arg3);
        }
    }
}
