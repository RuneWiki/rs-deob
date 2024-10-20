package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("x")
public class class16 {

    @ObfuscatedName("x.z")
    public int field254;

    @ObfuscatedName("x.n")
    public class130 field235;

    @ObfuscatedName("x.u")
    public DataInputStream field236;

    @ObfuscatedName("x.t")
    public byte[] field237 = new byte[4];

    @ObfuscatedName("x.e")
    public int field255;

    @ObfuscatedName("x.a")
    public byte[] field249;

    @ObfuscatedName("x.l")
    public int field240;

    @ObfuscatedName("x.v")
    public long field241;

    public class16(class120 arg0, URL arg1) {
        this.field235 = arg0.method2528(arg1);
        this.field254 = 0;
        this.field241 = class100.method496() + 30000L;
    }

    @ObfuscatedName("x.z(I)[B")
    public byte[] method181() throws IOException {
        if (class100.method496() > this.field241) {
            throw new IOException();
        }
        if (this.field254 == 0) {
            if (this.field235.field2055 == 2) {
                throw new IOException();
            }
            if (this.field235.field2055 == 1) {
                this.field236 = (DataInputStream) this.field235.field2059;
                this.field254 = 1;
            }
        }
        if (this.field254 == 1) {
            int var1 = this.field236.available();
            if (var1 > 0) {
                if (this.field255 + var1 > 4) {
                    var1 = 4 - this.field255;
                }
                this.field255 += this.field236.read(this.field237, this.field255, var1);
                if (this.field255 == 4) {
                    int var2 = (new class104(this.field237)).method2130();
                    this.field249 = new byte[var2];
                    this.field254 = 2;
                }
            }
        }
        if (this.field254 == 2) {
            int var3 = this.field236.available();
            if (var3 > 0) {
                if (this.field240 + var3 > this.field249.length) {
                    var3 = this.field249.length - this.field240;
                }
                this.field240 += this.field236.read(this.field249, this.field240, var3);
                if (this.field240 == this.field249.length) {
                    return this.field249;
                }
            }
        }
        return null;
    }
}
