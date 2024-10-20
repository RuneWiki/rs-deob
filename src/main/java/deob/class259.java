package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("il")
public class class259 extends class238 {

    @ObfuscatedName("il.i")
    public HashSet field3012;

    @ObfuscatedName("il.o")
    public HashSet field3013;

    @ObfuscatedName("il.n")
    public List field3014;

    @ObfuscatedName("il.bn(Lqy;Lqy;IZI)V")
    public void method4831(class467 arg0, class467 arg1, int arg2, boolean arg3) {
        this.method4502(arg0, arg2);
        int var5 = arg1.method7794();
        this.field3012 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class233 var7 = new class233();
            try {
                var7.method4425(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field3012.add(var7);
        }
        int var9 = arg1.method7794();
        this.field3013 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class241 var11 = new class241();
            try {
                var11.method4737(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field3013.add(var11);
        }
        this.method4828(arg1, arg3);
    }

    @ObfuscatedName("il.ba(Lqy;ZB)V")
    public void method4828(class467 arg0, boolean arg1) {
        this.field3014 = new LinkedList();
        int var3 = arg0.method7794();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method7810();
            class297 var6 = new class297(arg0.method7946());
            boolean var7 = arg0.method7792() == 1;
            if (arg1 || !var7) {
                this.field3014.add(new class244((class297) null, var6, var5, (class251) null));
            }
        }
    }
}
