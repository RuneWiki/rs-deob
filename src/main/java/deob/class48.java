package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ay")
public class class48 extends class36 {

    @ObfuscatedName("ay.m")
    public HashSet field356;

    @ObfuscatedName("ay.c")
    public HashSet field354;

    @ObfuscatedName("ay.i")
    public List field355;

    @ObfuscatedName("ay.cm(Lkj;Lkj;IZI)V")
    public void method632(class311 arg0, class311 arg1, int arg2, boolean arg3) {
        this.method339(arg0, arg2);
        int var5 = arg1.method5342();
        this.field356 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class25 var7 = new class25();
            try {
                var7.method212(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field356.add(var7);
        }
        int var9 = arg1.method5342();
        this.field354 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class49 var11 = new class49();
            try {
                var11.method634(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field354.add(var11);
        }
        this.method628(arg1, arg3);
    }

    @ObfuscatedName("ay.cz(Lkj;ZB)V")
    public void method628(class311 arg0, boolean arg1) {
        this.field355 = new LinkedList();
        int var3 = arg0.method5342();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5132();
            class223 var6 = new class223(arg0.method5120());
            boolean var7 = arg0.method5274() == 1;
            if (arg1 || !var7) {
                this.field355.add(new class28((class223) null, var6, var5, (class38) null));
            }
        }
    }
}
