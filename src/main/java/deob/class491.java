package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@ObfuscatedName("sa")
public class class491 extends class489 {

    @ObfuscatedName("sa.bk")
    public int field4927;

    @ObfuscatedName("sa.bn")
    public boolean field4924;

    @ObfuscatedName("sa.by")
    public int field4907;

    @ObfuscatedName("sa.bc")
    public int field4908;

    @ObfuscatedName("sa.bx")
    public int field4909;

    @ObfuscatedName("sa.bf")
    public int field4910;

    @ObfuscatedName("sa.bp")
    public int field4911;

    @ObfuscatedName("sa.bv")
    public boolean field4912;

    @ObfuscatedName("sa.bm")
    public int field4913;

    @ObfuscatedName("sa.bq")
    public int field4914;

    @ObfuscatedName("sa.bh")
    public int field4915;

    @ObfuscatedName("sa.bw")
    public int field4906;

    @ObfuscatedName("sa.bi")
    public String field4917;

    @ObfuscatedName("sa.bu")
    public String field4918;

    @ObfuscatedName("sa.be")
    public String field4919;

    @ObfuscatedName("sa.bs")
    public String field4920;

    @ObfuscatedName("sa.bl")
    public int field4928;

    @ObfuscatedName("sa.bz")
    public int field4922;

    @ObfuscatedName("sa.bo")
    public int field4904;

    @ObfuscatedName("sa.cg")
    public int field4901;

    @ObfuscatedName("sa.cb")
    public String field4925;

    @ObfuscatedName("sa.ci")
    public String field4926;

    @ObfuscatedName("sa.cv")
    public int[] field4921 = new int[3];

    @ObfuscatedName("sa.ct")
    public int field4897;

    @ObfuscatedName("sa.cp")
    public String field4929;

    @ObfuscatedName("sa.cq")
    public String field4930;

    public class491(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, String arg12, String arg13, String arg14, String arg15, int arg16, int arg17, int arg18, int arg19, String arg20, String arg21, int[] arg22, int arg23, String arg24, String arg25, String arg26) {
        this.field4927 = arg0;
        this.field4924 = arg1;
        this.field4907 = arg2;
        this.field4908 = arg3;
        this.field4909 = arg4;
        this.field4910 = arg5;
        this.field4911 = arg6;
        this.field4912 = arg7;
        this.field4913 = arg8;
        this.field4914 = arg9;
        this.field4915 = arg10;
        this.field4906 = arg11;
        this.field4917 = arg12;
        this.field4918 = arg13;
        this.field4919 = arg14;
        this.field4920 = arg15;
        this.field4928 = arg16;
        this.field4922 = arg17;
        this.field4904 = arg18;
        this.field4901 = arg19;
        this.field4925 = arg20;
        this.field4926 = arg21;
        this.field4921 = arg22;
        this.field4897 = arg23;
        this.field4929 = arg24;
        this.field4930 = arg25;
    }

    @ObfuscatedName("sa.am(Luk;I)V")
    public void method8012(class531 arg0) {
        arg0.method8699(9);
        arg0.method8699(this.field4927);
        arg0.method8699(this.field4924 ? 1 : 0);
        arg0.method8737(this.field4907);
        arg0.method8699(this.field4908);
        arg0.method8699(this.field4909);
        arg0.method8699(this.field4910);
        arg0.method8699(this.field4911);
        arg0.method8699(this.field4912 ? 1 : 0);
        arg0.method8737(this.field4913);
        arg0.method8699(this.field4914);
        arg0.method8778(this.field4915);
        arg0.method8737(this.field4906);
        arg0.method8552(this.field4917);
        arg0.method8552(this.field4918);
        arg0.method8552(this.field4919);
        arg0.method8552(this.field4920);
        arg0.method8699(this.field4922);
        arg0.method8737(this.field4928);
        arg0.method8552(this.field4925);
        arg0.method8552(this.field4926);
        arg0.method8699(this.field4904);
        arg0.method8699(this.field4901);
        for (int var2 = 0; var2 < this.field4921.length; var2++) {
            arg0.method8547(this.field4921[var2]);
        }
        arg0.method8547(this.field4897);
        arg0.method8552(this.field4929);
        arg0.method8552(this.field4930);
    }

    @ObfuscatedName("sa.ap(I)I")
    public int method8011() {
        byte var1 = 39;
        int var2 = var1 + class531.method4532(this.field4917);
        int var3 = var2 + class531.method4532(this.field4918);
        int var4 = var3 + class531.method4532(this.field4919);
        int var5 = var4 + class531.method4532(this.field4920);
        int var6 = var5 + class531.method4532(this.field4925);
        int var7 = var6 + class531.method4532(this.field4926);
        int var8 = var7 + class531.method4532(this.field4929);
        return var8 + class531.method4532(this.field4930);
    }

    @ObfuscatedName("sa.af(II)Ljava/lang/String;")
    public String method8014(int arg0) {
        String var2 = "";
        String var3 = "";
        switch(arg0) {
            case 1:
                var2 = "wmic csproduct get UUID";
                break;
            case 2:
                var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
        }
        try {
            Process var4 = Runtime.getRuntime().exec(var2);
            BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
            StringBuffer var6 = new StringBuffer();
            String var7;
            while ((var7 = var5.readLine()) != null) {
                var6.append(var7 + "\n");
            }
            if (arg0 == 1) {
                var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim();
            } else if (arg0 == 2) {
                int var8 = var6.indexOf("UUID: ") + 36;
                var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", "");
            }
        } catch (IOException var10) {
            var10.printStackTrace();
        }
        return var3;
    }
}
