package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@ObfuscatedName("sg")
public class class494 extends class492 {

    @ObfuscatedName("sg.bt")
    public int field4960;

    @ObfuscatedName("sg.bk")
    public boolean field4937;

    @ObfuscatedName("sg.bm")
    public int field4945;

    @ObfuscatedName("sg.bw")
    public int field4939;

    @ObfuscatedName("sg.bv")
    public int field4940;

    @ObfuscatedName("sg.by")
    public int field4941;

    @ObfuscatedName("sg.bb")
    public int field4938;

    @ObfuscatedName("sg.bn")
    public boolean field4952;

    @ObfuscatedName("sg.br")
    public int field4949;

    @ObfuscatedName("sg.bp")
    public int field4950;

    @ObfuscatedName("sg.bg")
    public int field4943;

    @ObfuscatedName("sg.be")
    public int field4947;

    @ObfuscatedName("sg.bc")
    public String field4948;

    @ObfuscatedName("sg.bz")
    public String field4953;

    @ObfuscatedName("sg.bh")
    public String field4932;

    @ObfuscatedName("sg.bs")
    public String field4951;

    @ObfuscatedName("sg.bj")
    public int field4957;

    @ObfuscatedName("sg.bl")
    public int field4930;

    @ObfuscatedName("sg.bx")
    public int field4954;

    @ObfuscatedName("sg.cs")
    public int field4955;

    @ObfuscatedName("sg.ch")
    public String field4956;

    @ObfuscatedName("sg.co")
    public String field4928;

    @ObfuscatedName("sg.cd")
    public int[] field4958 = new int[3];

    @ObfuscatedName("sg.cg")
    public int field4959;

    @ObfuscatedName("sg.cn")
    public String field4944;

    @ObfuscatedName("sg.cz")
    public String field4961;

    public class494(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, String arg12, String arg13, String arg14, String arg15, int arg16, int arg17, int arg18, int arg19, String arg20, String arg21, int[] arg22, int arg23, String arg24, String arg25, String arg26) {
        this.field4960 = arg0;
        this.field4937 = arg1;
        this.field4945 = arg2;
        this.field4939 = arg3;
        this.field4940 = arg4;
        this.field4941 = arg5;
        this.field4938 = arg6;
        this.field4952 = arg7;
        this.field4949 = arg8;
        this.field4950 = arg9;
        this.field4943 = arg10;
        this.field4947 = arg11;
        this.field4948 = arg12;
        this.field4953 = arg13;
        this.field4932 = arg14;
        this.field4951 = arg15;
        this.field4957 = arg16;
        this.field4930 = arg17;
        this.field4954 = arg18;
        this.field4955 = arg19;
        this.field4956 = arg20;
        this.field4928 = arg21;
        this.field4958 = arg22;
        this.field4959 = arg23;
        this.field4944 = arg24;
        this.field4961 = arg25;
    }

    @ObfuscatedName("sg.aq(Luq;I)V")
    public void method8011(class534 arg0) {
        arg0.method8574(9);
        arg0.method8574(this.field4960);
        arg0.method8574(this.field4937 ? 1 : 0);
        arg0.method8575(this.field4945);
        arg0.method8574(this.field4939);
        arg0.method8574(this.field4940);
        arg0.method8574(this.field4941);
        arg0.method8574(this.field4938);
        arg0.method8574(this.field4952 ? 1 : 0);
        arg0.method8575(this.field4949);
        arg0.method8574(this.field4950);
        arg0.method8576(this.field4943);
        arg0.method8575(this.field4947);
        arg0.method8582(this.field4948);
        arg0.method8582(this.field4953);
        arg0.method8582(this.field4932);
        arg0.method8582(this.field4951);
        arg0.method8574(this.field4930);
        arg0.method8575(this.field4957);
        arg0.method8582(this.field4956);
        arg0.method8582(this.field4928);
        arg0.method8574(this.field4954);
        arg0.method8574(this.field4955);
        for (int var2 = 0; var2 < this.field4958.length; var2++) {
            arg0.method8577(this.field4958[var2]);
        }
        arg0.method8577(this.field4959);
        arg0.method8582(this.field4944);
        arg0.method8582(this.field4961);
    }

    @ObfuscatedName("sg.aw(I)I")
    public int method8013() {
        byte var1 = 39;
        int var2 = var1 + class534.method3221(this.field4948);
        int var3 = var2 + class534.method3221(this.field4953);
        int var4 = var3 + class534.method3221(this.field4932);
        int var5 = var4 + class534.method3221(this.field4951);
        int var6 = var5 + class534.method3221(this.field4956);
        int var7 = var6 + class534.method3221(this.field4928);
        int var8 = var7 + class534.method3221(this.field4944);
        return var8 + class534.method3221(this.field4961);
    }

    @ObfuscatedName("sg.al(II)Ljava/lang/String;")
    public String method8010(int arg0) {
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
