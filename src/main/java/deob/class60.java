package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bc")
public class class60 extends class58 {

    @ObfuscatedName("bc.ar")
    public AudioFormat field1084;

    @ObfuscatedName("bc.aa")
    public SourceDataLine field1085;

    @ObfuscatedName("bc.af")
    public int field1083;

    @ObfuscatedName("bc.ax")
    public byte[] field1086;

    @ObfuscatedName("bc.l(Ljava/awt/Component;I)V")
    public void method1101(Component arg0) {
        this.field1084 = new AudioFormat((float) Statics.field2034, 16, Statics.field1059 ? 2 : 1, true, false);
        this.field1086 = new byte[0x100 << (Statics.field1059 ? 2 : 1)];
    }

    @ObfuscatedName("bc.s(IB)V")
    public void method1140(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1084, arg0 << (Statics.field1059 ? 2 : 1));
            this.field1085 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1085.open();
            this.field1085.start();
            this.field1083 = arg0;
        } catch (LineUnavailableException var11) {
            if (class158.method2017(arg0) == 1) {
                this.field1085 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method1140(var10);
        }
    }

    @ObfuscatedName("bc.r(B)I")
    public int method1103() {
        return this.field1083 - (this.field1085.available() >> (Statics.field1059 ? 2 : 1));
    }

    @ObfuscatedName("bc.m()V")
    public void method1104() {
        int var1 = 256;
        if (Statics.field1059) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1054[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1086[var2 * 2] = (byte) (var3 >> 8);
            this.field1086[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1085.write(this.field1086, 0, var1 << 1);
    }

    @ObfuscatedName("bc.i(B)V")
    public void method1105() {
        if (this.field1085 != null) {
            this.field1085.close();
            this.field1085 = null;
        }
    }

    @ObfuscatedName("bc.f(B)V")
    public void method1106() {
        this.field1085.flush();
    }
}
