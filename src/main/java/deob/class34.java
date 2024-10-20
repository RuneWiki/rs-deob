package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aj")
public class class34 extends class21 {

    @ObfuscatedName("aj.d")
    public HashSet field328;

    @ObfuscatedName("aj.j")
    public HashSet field325;

    @ObfuscatedName("aj.x")
    public List field327;

    @ObfuscatedName("aj.bt(Lgl;Lgl;Lgl;IZI)V")
    public void method549(class185 arg0, class185 arg1, class185 arg2, int arg3, boolean arg4) {
        this.method243(arg0, arg3);
        int var6 = arg2.method3467();
        this.field328 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class11 var8 = new class11();
            try {
                var8.method107(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field328.add(var8);
        }
        int var10 = arg2.method3467();
        this.field325 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class35 var12 = new class35();
            try {
                var12.method572(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field325.add(var12);
        }
        this.method550(arg1, arg4);
    }

    @ObfuscatedName("aj.cb(Lgl;ZB)V")
    public void method550(class185 arg0, boolean arg1) {
        this.field327 = new LinkedList();
        int var3 = arg0.method3467();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3594();
            class229 var6 = new class229(arg0.method3588());
            boolean var7 = arg0.method3679() == 1;
            if (arg1 || !var7) {
                this.field327.add(new class14(var5, var6));
            }
        }
    }
}
