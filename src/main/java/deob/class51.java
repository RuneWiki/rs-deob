package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("av")
public class class51 extends class52 {

    @ObfuscatedName("av.p")
    public AudioFormat field1081;

    @ObfuscatedName("av.e")
    public SourceDataLine field1079;

    @ObfuscatedName("av.a")
    public int field1078;

    @ObfuscatedName("av.h")
    public byte[] field1080;

    @ObfuscatedName("av.p(Ljava/awt/Component;)V")
    public void method937(Component arg0) {
        this.field1081 = new AudioFormat((float) Statics.field2457, 16, Statics.field1089 ? 2 : 1, true, false);
        this.field1080 = new byte[0x100 << (Statics.field1089 ? 2 : 1)];
    }

    @ObfuscatedName("av.e(I)V")
    public void method939(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1081, arg0 << (Statics.field1089 ? 2 : 1));
            this.field1079 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1079.open();
            this.field1079.start();
            this.field1078 = arg0;
        } catch (LineUnavailableException var11) {
            if (class124.method2145(arg0) == 1) {
                this.field1079 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method939(var10);
        }
    }

    @ObfuscatedName("av.a()I")
    public int method940() {
        return this.field1078 - (this.field1079.available() >> (Statics.field1089 ? 2 : 1));
    }

    @ObfuscatedName("av.h()V")
    public void method941() {
        int var1 = 256;
        if (Statics.field1089) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1084[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1080[var2 * 2] = (byte) (var3 >> 8);
            this.field1080[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1079.write(this.field1080, 0, var1 << 1);
    }

    @ObfuscatedName("av.y()V")
    public void method959() {
        if (this.field1079 != null) {
            this.field1079.close();
            this.field1079 = null;
        }
    }

    @ObfuscatedName("av.j()V")
    public void method953() {
        this.field1079.flush();
    }
}
