package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("iy")
public class class247 extends class226 {

    @ObfuscatedName("iy.h")
    public HashSet field2906;

    @ObfuscatedName("iy.t")
    public HashSet field2903;

    @ObfuscatedName("iy.u")
    public List field2905;

    @ObfuscatedName("iy.cn(Lqq;Lqq;IZI)V")
    public void method4689(class445 arg0, class445 arg1, int arg2, boolean arg3) {
        this.method4338(arg0, arg2);
        int var5 = arg1.method7198();
        this.field2906 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class221 var7 = new class221();
            try {
                var7.method4275(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2906.add(var7);
        }
        int var9 = arg1.method7198();
        this.field2903 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class229 var11 = new class229();
            try {
                var11.method4578(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2903.add(var11);
        }
        this.method4688(arg1, arg3);
    }

    @ObfuscatedName("iy.ct(Lqq;ZI)V")
    public void method4688(class445 arg0, boolean arg1) {
        this.field2905 = new LinkedList();
        int var3 = arg0.method7198();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method7301();
            class291 var6 = new class291(arg0.method7201());
            boolean var7 = arg0.method7196() == 1;
            if (arg1 || !var7) {
                this.field2905.add(new class232((class291) null, var6, var5, (class239) null));
            }
        }
    }
}
