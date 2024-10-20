package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@ObfuscatedName("ta")
public class class495 extends class493 {

    @ObfuscatedName("ta.bd")
    public int field4970;

    @ObfuscatedName("ta.bo")
    public boolean field4960;

    @ObfuscatedName("ta.bx")
    public int field4968;

    @ObfuscatedName("ta.bl")
    public int field4971;

    @ObfuscatedName("ta.bh")
    public int field4969;

    @ObfuscatedName("ta.bs")
    public int field4990;

    @ObfuscatedName("ta.bj")
    public int field4972;

    @ObfuscatedName("ta.bu")
    public boolean field4973;

    @ObfuscatedName("ta.br")
    public int field4982;

    @ObfuscatedName("ta.bb")
    public int field4974;

    @ObfuscatedName("ta.bk")
    public int field4976;

    @ObfuscatedName("ta.bt")
    public int field4977;

    @ObfuscatedName("ta.bq")
    public String field4978;

    @ObfuscatedName("ta.bi")
    public String field4979;

    @ObfuscatedName("ta.bw")
    public String field4980;

    @ObfuscatedName("ta.bm")
    public String field4981;

    @ObfuscatedName("ta.ba")
    public int field4991;

    @ObfuscatedName("ta.bv")
    public int field4986;

    @ObfuscatedName("ta.bg")
    public int field4984;

    @ObfuscatedName("ta.cb")
    public int field4959;

    @ObfuscatedName("ta.cj")
    public String field4966;

    @ObfuscatedName("ta.cr")
    public String field4987;

    @ObfuscatedName("ta.cy")
    public int[] field4988 = new int[3];

    @ObfuscatedName("ta.cg")
    public int field4989;

    @ObfuscatedName("ta.cl")
    public String field4967;

    @ObfuscatedName("ta.cw")
    public String field4975;

    public class495(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, String arg12, String arg13, String arg14, String arg15, int arg16, int arg17, int arg18, int arg19, String arg20, String arg21, int[] arg22, int arg23, String arg24, String arg25, String arg26) {
        this.field4970 = arg0;
        this.field4960 = arg1;
        this.field4968 = arg2;
        this.field4971 = arg3;
        this.field4969 = arg4;
        this.field4990 = arg5;
        this.field4972 = arg6;
        this.field4973 = arg7;
        this.field4982 = arg8;
        this.field4974 = arg9;
        this.field4976 = arg10;
        this.field4977 = arg11;
        this.field4978 = arg12;
        this.field4979 = arg13;
        this.field4980 = arg14;
        this.field4981 = arg15;
        this.field4991 = arg16;
        this.field4986 = arg17;
        this.field4984 = arg18;
        this.field4959 = arg19;
        this.field4966 = arg20;
        this.field4987 = arg21;
        this.field4988 = arg22;
        this.field4989 = arg23;
        this.field4967 = arg24;
        this.field4975 = arg25;
    }

    @ObfuscatedName("ta.az(Lur;I)V")
    public void method7885(class535 arg0) {
        arg0.method8445(9);
        arg0.method8445(this.field4970);
        arg0.method8445(this.field4960 ? 1 : 0);
        arg0.method8446(this.field4968);
        arg0.method8445(this.field4971);
        arg0.method8445(this.field4969);
        arg0.method8445(this.field4990);
        arg0.method8445(this.field4972);
        arg0.method8445(this.field4973 ? 1 : 0);
        arg0.method8446(this.field4982);
        arg0.method8445(this.field4974);
        arg0.method8646(this.field4976);
        arg0.method8446(this.field4977);
        arg0.method8453(this.field4978);
        arg0.method8453(this.field4979);
        arg0.method8453(this.field4980);
        arg0.method8453(this.field4981);
        arg0.method8445(this.field4986);
        arg0.method8446(this.field4991);
        arg0.method8453(this.field4966);
        arg0.method8453(this.field4987);
        arg0.method8445(this.field4984);
        arg0.method8445(this.field4959);
        for (int var2 = 0; var2 < this.field4988.length; var2++) {
            arg0.method8448(this.field4988[var2]);
        }
        arg0.method8448(this.field4989);
        arg0.method8453(this.field4967);
        arg0.method8453(this.field4975);
    }

    @ObfuscatedName("ta.ah(I)I")
    public int method7886() {
        byte var1 = 39;
        String var3 = this.field4978;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field4979;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field4980;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field4981;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field4966;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field4987;
        int var24 = var23.length() + 2;
        int var25 = var21 + var24;
        String var27 = this.field4967;
        int var28 = var27.length() + 2;
        int var29 = var25 + var28;
        String var31 = this.field4975;
        int var32 = var31.length() + 2;
        return var29 + var32;
    }

    @ObfuscatedName("ta.af(II)Ljava/lang/String;")
    public String method7887(int arg0) {
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
        try {
            Process var5 = Runtime.getRuntime().exec(var4);
            BufferedReader var6 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
            StringBuilder var7 = new StringBuilder();
            String var8;
            while ((var8 = var6.readLine()) != null) {
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
        } catch (IOException var11) {
        }
        return var3;
    }
}
