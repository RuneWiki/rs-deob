package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aj")
public class class48 extends class36 {

    @ObfuscatedName("aj.n")
    public HashSet field351;

    @ObfuscatedName("aj.x")
    public HashSet field352;

    @ObfuscatedName("aj.p")
    public List field350;

    @ObfuscatedName("aj.cp(Lkb;Lkb;IZI)V")
    public void method656(class311 arg0, class311 arg1, int arg2, boolean arg3) {
        this.method355(arg0, arg2);
        int var5 = arg1.method5163();
        this.field351 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class25 var7 = new class25();
            try {
                var7.method236(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field351.add(var7);
        }
        int var9 = arg1.method5163();
        this.field352 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class49 var11 = new class49();
            try {
                var11.method662(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field352.add(var11);
        }
        this.method650(arg1, arg3);
    }

    @ObfuscatedName("aj.cc(Lkb;ZI)V")
    public void method650(class311 arg0, boolean arg1) {
        this.field350 = new LinkedList();
        int var3 = arg0.method5163();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5394();
            class223 var6 = new class223(arg0.method5330());
            boolean var7 = arg0.method5276() == 1;
            if (arg1 || !var7) {
                this.field350.add(new class28((class223) null, var6, var5, (class38) null));
            }
        }
    }
}
