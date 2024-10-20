package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("at")
public class class46 extends class33 {

    @ObfuscatedName("at.e")
    public HashSet field558;

    @ObfuscatedName("at.f")
    public HashSet field555;

    @ObfuscatedName("at.l")
    public List field556;

    @ObfuscatedName("at.bz(Lgp;Lgp;Lgp;IZI)V")
    public void method581(class195 arg0, class195 arg1, class195 arg2, int arg3, boolean arg4) {
        this.method269(arg0, arg3);
        int var6 = arg2.method3218();
        this.field558 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method166(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field558.add(var8);
        }
        int var10 = arg2.method3218();
        this.field555 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class47 var12 = new class47();
            try {
                var12.method591(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field555.add(var12);
        }
        this.method582(arg1, arg4);
    }

    @ObfuscatedName("at.ca(Lgp;ZI)V")
    public void method582(class195 arg0, boolean arg1) {
        this.field556 = new LinkedList();
        int var3 = arg0.method3218();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3309();
            class239 var6 = new class239(arg0.method3230());
            boolean var7 = arg0.method3429() == 1;
            if (arg1 || !var7) {
                this.field556.add(new class26(var5, var6));
            }
        }
    }
}
