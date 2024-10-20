package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("gg")
public class class188 extends class167 {

    @ObfuscatedName("gg.i")
    public HashSet field2138;

    @ObfuscatedName("gg.k")
    public HashSet field2139;

    @ObfuscatedName("gg.g")
    public List field2141;

    @ObfuscatedName("gg.bu(Lnt;Lnt;IZI)V")
    public void method3357(class384 arg0, class384 arg1, int arg2, boolean arg3) {
        this.method3064(arg0, arg2);
        int var5 = arg1.method5899();
        this.field2138 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class162 var7 = new class162();
            try {
                var7.method2941(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2138.add(var7);
        }
        int var9 = arg1.method5899();
        this.field2139 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class170 var11 = new class170();
            try {
                var11.method3242(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2139.add(var11);
        }
        this.method3355(arg1, arg3);
    }

    @ObfuscatedName("gg.bl(Lnt;ZB)V")
    public void method3355(class384 arg0, boolean arg1) {
        this.field2141 = new LinkedList();
        int var3 = arg0.method5899();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5914();
            class244 var6 = new class244(arg0.method5965());
            boolean var7 = arg0.method5902() == 1;
            if (arg1 || !var7) {
                this.field2141.add(new class173((class244) null, var6, var5, (class180) null));
            }
        }
    }
}
