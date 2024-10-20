package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ar")
public class class39 extends class27 {

    @ObfuscatedName("ar.r")
    public HashSet field319;

    @ObfuscatedName("ar.y")
    public HashSet field317;

    @ObfuscatedName("ar.p")
    public List field318;

    @ObfuscatedName("ar.bx(Lky;Lky;IZI)V")
    public void method553(class300 arg0, class300 arg1, int arg2, boolean arg3) {
        this.method271(arg0, arg2);
        int var5 = arg1.method5054();
        this.field319 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class16 var7 = new class16();
            try {
                var7.method150(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field319.add(var7);
        }
        int var9 = arg1.method5054();
        this.field317 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class40 var11 = new class40();
            try {
                var11.method570(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field317.add(var11);
        }
        this.method548(arg1, arg3);
    }

    @ObfuscatedName("ar.ba(Lky;ZB)V")
    public void method548(class300 arg0, boolean arg1) {
        this.field318 = new LinkedList();
        int var3 = arg0.method5054();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5246();
            class214 var6 = new class214(arg0.method5056());
            boolean var7 = arg0.method5179() == 1;
            if (arg1 || !var7) {
                this.field318.add(new class19((class214) null, var6, var5, (class29) null));
            }
        }
    }
}
