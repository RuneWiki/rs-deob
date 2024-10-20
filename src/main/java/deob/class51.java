package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ao")
public class class51 extends class52 {

    @ObfuscatedName("ao.f")
    public AudioFormat field1071;

    @ObfuscatedName("ao.t")
    public SourceDataLine field1072;

    @ObfuscatedName("ao.n")
    public int field1073;

    @ObfuscatedName("ao.e")
    public byte[] field1074;

    @ObfuscatedName("ao.f(Ljava/awt/Component;)V")
    public void method919(Component arg0) {
        this.field1071 = new AudioFormat((float) Statics.field1089, 16, Statics.field1778 ? 2 : 1, true, false);
        this.field1074 = new byte[0x100 << (Statics.field1778 ? 2 : 1)];
    }

    @ObfuscatedName("ao.t(I)V")
    public void method930(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1071, arg0 << (Statics.field1778 ? 2 : 1));
            this.field1072 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1072.open();
            this.field1072.start();
            this.field1073 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1072 = null;
                throw var11;
            } else {
                this.method930(class124.method730(arg0));
            }
        }
    }

    @ObfuscatedName("ao.n()I")
    public int method921() {
        return this.field1073 - (this.field1072.available() >> (Statics.field1778 ? 2 : 1));
    }

    @ObfuscatedName("ao.e()V")
    public void method922() {
        int var1 = 256;
        if (Statics.field1778) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1078[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1074[var2 * 2] = (byte) (var3 >> 8);
            this.field1074[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1072.write(this.field1074, 0, var1 << 1);
    }

    @ObfuscatedName("ao.l()V")
    public void method939() {
        if (this.field1072 != null) {
            this.field1072.close();
            this.field1072 = null;
        }
    }

    @ObfuscatedName("ao.d()V")
    public void method924() {
        this.field1072.flush();
    }
}
