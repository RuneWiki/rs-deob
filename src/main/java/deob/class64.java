package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bo")
public class class64 extends class51 {

    @ObfuscatedName("bo.v")
    public AudioFormat field1183;

    @ObfuscatedName("bo.t")
    public SourceDataLine field1185;

    @ObfuscatedName("bo.as")
    public int field1184;

    @ObfuscatedName("bo.at")
    public byte[] field1182;

    @ObfuscatedName("bo.v(Ljava/awt/Component;)V")
    public void method948(Component arg0) {
        this.field1183 = new AudioFormat((float) Statics.field1819, 16, Statics.field1078 ? 2 : 1, true, false);
        this.field1182 = new byte[0x100 << (Statics.field1078 ? 2 : 1)];
    }

    @ObfuscatedName("bo.t(I)V")
    public void method931(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1183, arg0 << (Statics.field1078 ? 2 : 1));
            this.field1185 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1185.open();
            this.field1185.start();
            this.field1184 = arg0;
        } catch (LineUnavailableException var11) {
            if (class117.method1609(arg0) == 1) {
                this.field1185 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method931(var10);
        }
    }

    @ObfuscatedName("bo.f()I")
    public int method932() {
        return this.field1184 - (this.field1185.available() >> (Statics.field1078 ? 2 : 1));
    }

    @ObfuscatedName("bo.j()V")
    public void method933() {
        int var1 = 256;
        if (Statics.field1078) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1075[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1182[var2 * 2] = (byte) (var3 >> 8);
            this.field1182[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1185.write(this.field1182, 0, var1 << 1);
    }

    @ObfuscatedName("bo.l()V")
    public void method934() {
        if (this.field1185 != null) {
            this.field1185.close();
            this.field1185 = null;
        }
    }

    @ObfuscatedName("bo.g()V")
    public void method939() {
        this.field1185.flush();
    }
}
