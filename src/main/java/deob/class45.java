package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ac")
public class class45 extends class33 {

    @ObfuscatedName("ac.s")
    public HashSet field587;

    @ObfuscatedName("ac.n")
    public HashSet field582;

    @ObfuscatedName("ac.c")
    public List field583;

    @ObfuscatedName("ac.bi(Lfw;Lfw;Lfw;IZI)V")
    public void method547(class174 arg0, class174 arg1, class174 arg2, int arg3, boolean arg4) {
        this.method233(arg0, arg3);
        int var6 = arg2.method2930();
        this.field587 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method127(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field587.add(var8);
        }
        int var10 = arg2.method2930();
        this.field582 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method560(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field582.add(var12);
        }
        this.method548(arg1, arg4);
    }

    @ObfuscatedName("ac.cx(Lfw;ZI)V")
    public void method548(class174 arg0, boolean arg1) {
        this.field583 = new LinkedList();
        int var3 = arg0.method2930();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3012();
            class213 var6 = new class213(arg0.method2896());
            boolean var7 = arg0.method2891() == 1;
            if (arg1 || !var7) {
                this.field583.add(new class26(var5, var6));
            }
        }
    }
}
