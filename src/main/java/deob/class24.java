package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("p")
public class class24 {

    @ObfuscatedName("p.b")
    public int field385;

    @ObfuscatedName("p.c")
    public class79 field382;

    @ObfuscatedName("p.j")
    public DataInputStream field390;

    @ObfuscatedName("p.i")
    public byte[] field384 = new byte[4];

    @ObfuscatedName("p.k")
    public int field388;

    @ObfuscatedName("p.q")
    public byte[] field383;

    @ObfuscatedName("p.t")
    public int field387;

    @ObfuscatedName("p.v")
    public long field392;

    public class24(class74 arg0, URL arg1) {
        this.field382 = arg0.method1465(arg1);
        this.field385 = 0;
        this.field392 = class121.method2318() + 30000L;
    }

    @ObfuscatedName("p.b(B)[B")
    public byte[] method228() throws IOException {
        if (class121.method2318() > this.field392) {
            throw new IOException();
        }
        if (this.field385 == 0) {
            if (this.field382.field1433 == 2) {
                throw new IOException();
            }
            if (this.field382.field1433 == 1) {
                this.field390 = (DataInputStream) this.field382.field1435;
                this.field385 = 1;
            }
        }
        if (this.field385 == 1) {
            int var1 = this.field390.available();
            if (var1 > 0) {
                if (this.field388 + var1 > 4) {
                    var1 = 4 - this.field388;
                }
                this.field388 += this.field390.read(this.field384, this.field388, var1);
                if (this.field388 == 4) {
                    int var2 = (new class127(this.field384)).method2455();
                    this.field383 = new byte[var2];
                    this.field385 = 2;
                }
            }
        }
        if (this.field385 == 2) {
            int var3 = this.field390.available();
            if (var3 > 0) {
                if (this.field387 + var3 > this.field383.length) {
                    var3 = this.field383.length - this.field387;
                }
                this.field387 += this.field390.read(this.field383, this.field387, var3);
                if (this.field387 == this.field383.length) {
                    return this.field383;
                }
            }
        }
        return null;
    }
}
