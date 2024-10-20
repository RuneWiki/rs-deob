package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("b")
public class class24 {

    @ObfuscatedName("b.i")
    public byte[] field393 = new byte[4];

    @ObfuscatedName("b.w")
    public int field388;

    @ObfuscatedName("b.f")
    public class79 field384;

    @ObfuscatedName("b.e")
    public DataInputStream field385;

    @ObfuscatedName("b.t")
    public int field387;

    @ObfuscatedName("b.d")
    public byte[] field389;

    @ObfuscatedName("b.p")
    public int field386;

    @ObfuscatedName("b.k")
    public long field394;

    public class24(class74 arg0, URL arg1) {
        this.field384 = arg0.method1477(arg1);
        this.field388 = 0;
        this.field394 = class121.method145() + 30000L;
    }

    @ObfuscatedName("b.i(I)[B")
    public byte[] method234() throws IOException {
        if (class121.method145() > this.field394) {
            throw new IOException();
        }
        if (this.field388 == 0) {
            if (this.field384.field1409 == 2) {
                throw new IOException();
            }
            if (this.field384.field1409 == 1) {
                this.field385 = (DataInputStream) this.field384.field1411;
                this.field388 = 1;
            }
        }
        if (this.field388 == 1) {
            int var1 = this.field385.available();
            if (var1 > 0) {
                if (this.field387 + var1 > 4) {
                    var1 = 4 - this.field387;
                }
                this.field387 += this.field385.read(this.field393, this.field387, var1);
                if (this.field387 == 4) {
                    int var2 = (new class127(this.field393)).method2457();
                    this.field389 = new byte[var2];
                    this.field388 = 2;
                }
            }
        }
        if (this.field388 == 2) {
            int var3 = this.field385.available();
            if (var3 > 0) {
                if (this.field386 + var3 > this.field389.length) {
                    var3 = this.field389.length - this.field386;
                }
                this.field386 += this.field385.read(this.field389, this.field386, var3);
                if (this.field386 == this.field389.length) {
                    return this.field389;
                }
            }
        }
        return null;
    }
}
