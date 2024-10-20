package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ai")
public class class51 extends class52 {

    @ObfuscatedName("ai.y")
    public AudioFormat field1073;

    @ObfuscatedName("ai.m")
    public SourceDataLine field1072;

    @ObfuscatedName("ai.d")
    public int field1074;

    @ObfuscatedName("ai.k")
    public byte[] field1075;

    @ObfuscatedName("ai.y(Ljava/awt/Component;)V")
    public void method935(Component arg0) {
        this.field1073 = new AudioFormat((float) Statics.field1094, 16, Statics.field1077 ? 2 : 1, true, false);
        this.field1075 = new byte[0x100 << (Statics.field1077 ? 2 : 1)];
    }

    @ObfuscatedName("ai.m(I)V")
    public void method936(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1073, arg0 << (Statics.field1077 ? 2 : 1));
            this.field1072 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1072.open();
            this.field1072.start();
            this.field1074 = arg0;
        } catch (LineUnavailableException var11) {
            if (class124.method1878(arg0) == 1) {
                this.field1072 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method936(var10);
        }
    }

    @ObfuscatedName("ai.d()I")
    public int method937() {
        return this.field1074 - (this.field1072.available() >> (Statics.field1077 ? 2 : 1));
    }

    @ObfuscatedName("ai.k()V")
    public void method945() {
        int var1 = 256;
        if (Statics.field1077) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1101[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1075[var2 * 2] = (byte) (var3 >> 8);
            this.field1075[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1072.write(this.field1075, 0, var1 << 1);
    }

    @ObfuscatedName("ai.n()V")
    public void method939() {
        if (this.field1072 != null) {
            this.field1072.close();
            this.field1072 = null;
        }
    }

    @ObfuscatedName("ai.s()V")
    public void method940() {
        this.field1072.flush();
    }
}
