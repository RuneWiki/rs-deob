package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kn")
public class class277 extends class256 {

    @ObfuscatedName("kn.aj")
    public HashSet field3056;

    @ObfuscatedName("kn.ad")
    public HashSet field3057;

    @ObfuscatedName("kn.ac")
    public List field3054;

    @ObfuscatedName("kn.ci(Ltz;Ltz;IZB)V")
    public void method5034(class501 arg0, class501 arg1, int arg2, boolean arg3) {
        this.method4718(arg0, arg2);
        int var5 = arg1.method8195();
        this.field3056 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class251 var7 = new class251();
            try {
                var7.method4634(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field3056.add(var7);
        }
        int var9 = arg1.method8195();
        this.field3057 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class259 var11 = new class259();
            try {
                var11.method4926(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field3057.add(var11);
        }
        this.method5038(arg1, arg3);
    }

    @ObfuscatedName("kn.cb(Ltz;ZB)V")
    public void method5038(class501 arg0, boolean arg1) {
        this.field3054 = new LinkedList();
        int var3 = arg0.method8195();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method8148();
            class321 var6 = new class321(arg0.method8134());
            boolean var7 = arg0.method8129() == 1;
            if (arg1 || !var7) {
                this.field3054.add(new class262((class321) null, var6, var5, (class269) null));
            }
        }
    }
}
