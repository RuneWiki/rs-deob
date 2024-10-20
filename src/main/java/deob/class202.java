package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("gh")
public class class202 extends class181 {

    @ObfuscatedName("gh.v")
    public HashSet field2208;

    @ObfuscatedName("gh.f")
    public HashSet field2209;

    @ObfuscatedName("gh.s")
    public List field2207;

    @ObfuscatedName("gh.ch(Lot;Lot;IZB)V")
    public void method3547(class400 arg0, class400 arg1, int arg2, boolean arg3) {
        this.method3183(arg0, arg2);
        int var5 = arg1.method6219();
        this.field2208 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class176 var7 = new class176();
            try {
                var7.method3120(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2208.add(var7);
        }
        int var9 = arg1.method6219();
        this.field2209 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class184 var11 = new class184();
            try {
                var11.method3434(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2209.add(var11);
        }
        this.method3559(arg1, arg3);
    }

    @ObfuscatedName("gh.cx(Lot;ZB)V")
    public void method3559(class400 arg0, boolean arg1) {
        this.field2207 = new LinkedList();
        int var3 = arg0.method6219();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method6387();
            class258 var6 = new class258(arg0.method6222());
            boolean var7 = arg0.method6217() == 1;
            if (arg1 || !var7) {
                this.field2207.add(new class187((class258) null, var6, var5, (class194) null));
            }
        }
    }
}
