package deob;

import java.util.ArrayList;
import java.util.Arrays;

@ObfuscatedName("cp")
public class class74 {

    @ObfuscatedName("cp.ac")
    public final ArrayList field903 = new ArrayList(1);

    @ObfuscatedName("cp.ae")
    public int field893 = -1;

    @ObfuscatedName("cp.ag")
    public int field899 = 0;

    @ObfuscatedName("cp.am")
    public class352 field895 = new class352();

    @ObfuscatedName("cp.ax")
    public byte field896;

    @ObfuscatedName("cp.aq")
    public int field897 = 0;

    @ObfuscatedName("cp.af")
    public int field898 = -1;

    @ObfuscatedName("cp.at")
    public int field892 = -1;

    @ObfuscatedName("cp.au")
    public class277 field900;

    @ObfuscatedName("cp.ar")
    public class551 field901;

    @ObfuscatedName("cp.al")
    public String[] field902 = new String[3];

    public class74(int arg0) {
        this.field893 = arg0;
        for (int var2 = 0; var2 < 3; var2++) {
            this.field902[var2] = "";
        }
    }

    @ObfuscatedName("cp.ac(B)V")
    public void method2096() {
        this.field901 = null;
        this.field903.clear();
    }

    @ObfuscatedName("cp.ae(II)V")
    public void method2174(int arg0) {
        this.field899 = arg0;
        this.field897 = 0;
        this.field898 = -1;
        this.field892 = -1;
        this.field896 = 0;
        this.field900 = class277.field3037;
        this.field901 = null;
    }

    @ObfuscatedName("cp.ag(Ldi;I)V")
    public void method2098(class95 arg0) {
        this.field903.add(arg0);
    }

    @ObfuscatedName("cp.am(Ldi;I)V")
    public void method2099(class95 arg0) {
        this.field903.remove(arg0);
    }

    @ObfuscatedName("cp.ax(ILdd;I)Ldi;")
    public class95 method2100(int arg0, class104 arg1) {
        class95 var3 = new class95();
        var3.field1143 = arg0;
        if (this.field901 != null) {
            var3.method2465(this.field901);
        }
        var3.field1243 = this.field897;
        var3.field1253 = this.field892;
        var3.field1290[0] = this.field900;
        var3.field1167 = this.field895.field3755;
        var3.field1169 = arg1;
        var3.field1147 = this.field902;
        var3.method2449(this.field895.field3754 - arg1.field1350, this.field895.field3756 - arg1.field1357);
        return var3;
    }

    @ObfuscatedName("cp.aq(I)Z")
    public boolean method2101() {
        return this.field899 == -1;
    }

    @ObfuscatedName("cp.af(I)V")
    public void method2102() {
        this.field899 = this.field895.method6084();
    }

    @ObfuscatedName("cp.at(III)V")
    public void method2103(int arg0, int arg1) {
        this.field895.method6085(this.field899, arg0, arg1);
        this.field899 = -1;
    }

    @ObfuscatedName("cp.au(I)I")
    public int method2104() {
        return this.field895.field3755;
    }

    @ObfuscatedName("cp.ar(II)V")
    public void method2155(int arg0) {
        this.field895.field3755 = arg0;
    }

    @ObfuscatedName("cp.al(Lkk;I)V")
    public void method2095(class277 arg0) {
        for (int var2 = 0; var2 < this.field903.size(); var2++) {
            class95 var3 = (class95) this.field903.get(var2);
            class104 var4 = var3.field1169;
            int var5 = this.field895.field3754 - var4.field1350;
            int var6 = this.field895.field3756 - var4.field1357;
            class277 var7 = arg0;
            boolean var8 = true;
            boolean var9 = true;
            if (Statics.field1791 == var3 && (var3.field1300 < 1536 || var3.field1225 < 1536 || var3.field1300 >= 11776 || var3.field1225 >= 11776)) {
                var7 = class277.field3039;
            }
            var3.field1167 = this.field895.field3755;
            if (class277.field3039 == var7) {
                var3.method2449(var5, var6);
            } else {
                var3.method2440(var4, var5, var6, var7);
            }
        }
    }

    @ObfuscatedName("cp.ad(Lvf;B)V")
    public void method2107(class551 arg0) {
        this.field901 = arg0;
        for (int var2 = 0; var2 < this.field903.size(); var2++) {
            ((class95) this.field903.get(var2)).method2465(this.field901);
        }
    }

    @ObfuscatedName("cp.ah(IIB)V")
    public void method2161(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field903.size(); var3++) {
            client.method5196((class95) this.field903.get(var3), arg0, arg1);
        }
    }

    @ObfuscatedName("cp.ap(IS)V")
    public void method2151(int arg0) {
        this.field892 = arg0;
        for (int var2 = 0; var2 < this.field903.size(); var2++) {
            ((class100) this.field903.get(var2)).field1253 = arg0;
        }
    }

    @ObfuscatedName("cp.ab(Ljava/lang/String;I)V")
    public void method2110(String arg0) {
        String var2 = "";
        for (int var3 = 0; var3 < this.field903.size(); var3++) {
            class95 var4 = (class95) this.field903.get(var3);
            var4.field1280 = false;
            var4.field1298 = 0;
            var4.field1224 = 0;
            var4.field1248 = 150;
            var4.field1245 = arg0;
            var2 = var4.field1168.method9621();
        }
        if (arg0.charAt(0) == '~') {
            String var5 = arg0.substring(1);
            class116.method3755(2, var2, var5);
        } else if (client.field652 == this.field893) {
            class116.method3755(2, var2, arg0);
        }
    }

    @ObfuscatedName("cp.az(IIIIIB)V")
    public void method2111(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = 0; var6 < this.field903.size(); var6++) {
            ((class100) this.field903.get(var6)).method2514(arg0, arg1, arg2, arg3, client.field609, arg4);
        }
    }

    @ObfuscatedName("cp.aa(IIIIII)V")
    public void method2105(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = 0; var6 < this.field903.size(); var6++) {
            ((class100) this.field903.get(var6)).method2520(arg0, client.field609, arg1, arg2, arg3, arg4);
        }
    }

    @ObfuscatedName("cp.ai(II)V")
    public void method2113(int arg0) {
        for (int var2 = 0; var2 < this.field903.size(); var2++) {
            ((class100) this.field903.get(var2)).method2515(arg0);
        }
    }

    @ObfuscatedName("cp.ao(IB)V")
    public void method2114(int arg0) {
        this.field898 = arg0;
        for (int var2 = 0; var2 < this.field903.size(); var2++) {
            class95 var3 = (class95) this.field903.get(var2);
            var3.field1261 = this.field898;
            if (var3.field1294 == 0) {
                var3.field1243 = this.field898;
                var3.method2538();
            }
        }
    }

    @ObfuscatedName("cp.as(ILoq;ZLjava/lang/String;[BI)V")
    public void method2115(int arg0, class385 arg1, boolean arg2, String arg3, byte[] arg4) {
        boolean var6 = false;
        String var7 = null;
        for (int var8 = 0; var8 < this.field903.size(); var8++) {
            class95 var9 = (class95) this.field903.get(var8);
            if (var9.field1168 != null && var9.field1170 != null) {
                boolean var10 = false;
                if (arg1.field4472 && Statics.field4723.method1889(var9.field1168)) {
                    var10 = true;
                }
                if (!var10 && client.field729 == 0 && !var9.field1163) {
                    var6 = true;
                    var7 = var9.field1168.method9621();
                    var9.field1245 = arg3.trim();
                    var9.field1298 = arg0 >> 8;
                    var9.field1224 = arg0 & 0xFF;
                    var9.field1248 = 150;
                    byte[] var12 = arg4;
                    int[] var15;
                    if (arg4 == null || arg4.length == 0 || arg4.length > 8) {
                        var15 = null;
                    } else {
                        int[] var13 = new int[arg4.length];
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var12.length) {
                                var15 = var13;
                                break;
                            }
                            if (var12[var14] < 0 || var12[var14] >= class575.field5578.length) {
                                var15 = null;
                                break;
                            }
                            var13[var14] = class575.field5578[var12[var14]];
                            var14++;
                        }
                    }
                    var9.field1251 = var15;
                    var9.field1280 = arg2;
                    var9.field1276 = Statics.field4826 != var9 && arg1.field4472 && !client.field746.isEmpty() && arg3.toLowerCase().indexOf(client.field746) == -1;
                }
            }
        }
        if (!var6 || var7 == null) {
            return;
        }
        int var16;
        if (arg1.field4489) {
            var16 = arg2 ? 91 : 1;
        } else {
            var16 = arg2 ? 90 : 2;
        }
        if (arg1.field4488 == -1) {
            class116.method3755(var16, var7, arg3);
        } else {
            class116.method3755(var16, class107.method3697(arg1.field4488) + var7, arg3);
        }
    }

    @ObfuscatedName("cp.ay(IIIIIIIZB)V")
    public void method2173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        for (int var9 = 0; var9 < this.field903.size(); var9++) {
            class95 var10 = (class95) this.field903.get(var9);
            var10.field1258 = arg0;
            var10.field1249 = arg1;
            var10.field1277 = arg2;
            var10.field1232 = arg3;
            var10.field1247 = arg4;
            var10.field1234 = arg5;
            var10.field1292 = arg6;
            if (arg7) {
                class104 var11 = var10.field1169;
                int var12 = this.field895.field3754 - var11.field1350;
                int var13 = this.field895.field3756 - var11.field1357;
                var10.field1258 += var12;
                var10.field1249 += var13;
                var10.field1277 += var12;
                var10.field1232 += var13;
                var10.field1294 = 0;
            } else {
                var10.field1258 += var10.field1295[0];
                var10.field1249 += var10.field1296[0];
                var10.field1277 += var10.field1295[0];
                var10.field1232 += var10.field1296[0];
                var10.field1294 = 1;
            }
            var10.field1299 = 0;
        }
    }

    @ObfuscatedName("cp.aj([Ljava/lang/String;I)V")
    public void method2117(String[] arg0) {
        this.field902 = (String[]) ((String[]) Arrays.copyOf(arg0, arg0.length));
        for (int var2 = 0; var2 < this.field903.size(); var2++) {
            ((class95) this.field903.get(var2)).field1147 = (String[]) ((String[]) Arrays.copyOf(arg0, arg0.length));
        }
    }

    @ObfuscatedName("cp.av(IIBBBBI)V")
    public void method2138(int arg0, int arg1, byte arg2, byte arg3, byte arg4, byte arg5) {
        for (int var7 = 0; var7 < this.field903.size(); var7++) {
            class95 var8 = (class95) this.field903.get(var7);
            var8.field1285 = arg0;
            var8.field1259 = arg1;
            var8.field1260 = arg2;
            var8.field1288 = arg3;
            var8.field1289 = arg4;
            var8.field1286 = arg5;
        }
    }

    @ObfuscatedName("cp.aw(IIIII)V")
    public void method2119(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field903.size(); var5++) {
            ((class100) this.field903.get(var5)).method2516(arg0, arg1, arg2, arg3);
        }
    }
}
