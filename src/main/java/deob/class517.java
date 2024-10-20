package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@ObfuscatedName("ta")
public class class517 extends class515 implements class118 {

    @ObfuscatedName("ta.bq")
    public int field5186;

    @ObfuscatedName("ta.bp")
    public boolean field5201;

    @ObfuscatedName("ta.bz")
    public int field5188;

    @ObfuscatedName("ta.bc")
    public int field5189;

    @ObfuscatedName("ta.by")
    public int field5190;

    @ObfuscatedName("ta.br")
    public int field5191;

    @ObfuscatedName("ta.bn")
    public int field5207;

    @ObfuscatedName("ta.bu")
    public boolean field5210;

    @ObfuscatedName("ta.bt")
    public int field5194;

    @ObfuscatedName("ta.bs")
    public int field5195;

    @ObfuscatedName("ta.bo")
    public int field5196;

    @ObfuscatedName("ta.bd")
    public int field5197;

    @ObfuscatedName("ta.ba")
    public String field5211;

    @ObfuscatedName("ta.bw")
    public String field5179;

    @ObfuscatedName("ta.bi")
    public String field5178;

    @ObfuscatedName("ta.bf")
    public String field5198;

    @ObfuscatedName("ta.bg")
    public int field5202;

    @ObfuscatedName("ta.bl")
    public int field5200;

    @ObfuscatedName("ta.be")
    public int field5204;

    @ObfuscatedName("ta.cq")
    public int field5205;

    @ObfuscatedName("ta.cb")
    public String field5206;

    @ObfuscatedName("ta.cd")
    public String field5182;

    @ObfuscatedName("ta.ci")
    public int[] field5208 = new int[3];

    @ObfuscatedName("ta.cn")
    public int field5209;

    @ObfuscatedName("ta.co")
    public String field5193;

    @ObfuscatedName("ta.cf")
    public String field5192;

    public class517(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, String arg12, String arg13, String arg14, String arg15, int arg16, int arg17, int arg18, int arg19, String arg20, String arg21, int[] arg22, int arg23, String arg24, String arg25, String arg26) {
        this.field5186 = arg0;
        this.field5201 = arg1;
        this.field5188 = arg2;
        this.field5189 = arg3;
        this.field5190 = arg4;
        this.field5191 = arg5;
        this.field5207 = arg6;
        this.field5210 = arg7;
        this.field5194 = arg8;
        this.field5195 = arg9;
        this.field5196 = arg10;
        this.field5197 = arg11;
        this.field5211 = arg12;
        this.field5179 = arg13;
        this.field5178 = arg14;
        this.field5198 = arg15;
        this.field5202 = arg16;
        this.field5200 = arg17;
        this.field5204 = arg18;
        this.field5205 = arg19;
        this.field5206 = arg20;
        this.field5182 = arg21;
        this.field5208 = arg22;
        this.field5209 = arg23;
        this.field5193 = arg24;
        this.field5192 = arg25;
    }

    @ObfuscatedName("ta.ap(Lvl;I)V")
    public void method8686(class558 arg0) {
        arg0.method9241(9);
        arg0.method9241(this.field5186);
        arg0.method9241(this.field5201 ? 1 : 0);
        arg0.method9257(this.field5188);
        arg0.method9241(this.field5189);
        arg0.method9241(this.field5190);
        arg0.method9241(this.field5191);
        arg0.method9241(this.field5207);
        arg0.method9241(this.field5210 ? 1 : 0);
        arg0.method9257(this.field5194);
        arg0.method9241(this.field5195);
        arg0.method9243(this.field5196);
        arg0.method9257(this.field5197);
        arg0.method9454(this.field5211);
        arg0.method9454(this.field5179);
        arg0.method9454(this.field5178);
        arg0.method9454(this.field5198);
        arg0.method9241(this.field5200);
        arg0.method9257(this.field5202);
        arg0.method9454(this.field5206);
        arg0.method9454(this.field5182);
        arg0.method9241(this.field5204);
        arg0.method9241(this.field5205);
        for (int var2 = 0; var2 < this.field5208.length; var2++) {
            arg0.method9244(this.field5208[var2]);
        }
        arg0.method9244(this.field5209);
        arg0.method9454(this.field5193);
        arg0.method9454(this.field5192);
    }

    @ObfuscatedName("ta.aw(I)I")
    public int method8687() {
        byte var1 = 39;
        String var3 = this.field5211;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        int var6 = var5 + class558.method2571(this.field5179);
        int var7 = var6 + class558.method2571(this.field5178);
        int var8 = var7 + class558.method2571(this.field5198);
        int var9 = var8 + class558.method2571(this.field5206);
        int var10 = var9 + class558.method2571(this.field5182);
        String var12 = this.field5193;
        int var13 = var12.length() + 2;
        int var14 = var10 + var13;
        return var14 + class558.method2571(this.field5192);
    }

    @ObfuscatedName("ta.ak(II)Ljava/lang/String;")
    public String method8685(int arg0) {
        String var2 = "";
        String var3 = "12345678-0000-0000-0000-123456789012";
        String var4;
        switch(arg0) {
            case 1:
                var4 = "wmic csproduct get UUID";
                break;
            case 2:
                var4 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
                break;
            case 3:
                var4 = "cat /etc/machine-id";
                break;
            default:
                return "Unknown";
        }
        BufferedReader var5 = null;
        try {
            Process var6 = Runtime.getRuntime().exec(var4);
            var5 = new BufferedReader(new InputStreamReader(var6.getInputStream()));
            StringBuilder var7 = new StringBuilder();
            String var8;
            while ((var8 = var5.readLine()) != null) {
                var7.append(var8 + "\n");
            }
            if (arg0 == 1) {
                var3 = var7.substring(var7.indexOf("\n"), var7.length()).trim();
            } else if (arg0 == 2) {
                int var9 = var7.indexOf("UUID: ") + 36;
                var3 = var7.substring(var7.indexOf("UUID: "), var9).replace("UUID: ", "");
            } else if (arg0 == 3) {
                if (var7.length() == 33) {
                    var7 = new StringBuilder(var7.substring(0, var7.length() - 1));
                }
                if (var7.length() == 32) {
                    var7.insert(20, "-");
                    var7.insert(16, "-");
                    var7.insert(12, "-");
                    var7.insert(8, "-");
                    var3 = var7.toString();
                } else {
                    var3 = "12345678-0000-0000-0000-123456789012";
                }
            }
        } catch (Exception var21) {
        } finally {
            try {
                if (var5 != null) {
                    var5.close();
                }
            } catch (IOException var20) {
            }
        }
        return var3;
    }
}
