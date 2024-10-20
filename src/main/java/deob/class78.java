package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("bx")
public class class78 {

    @ObfuscatedName("bx.c")
    public int field1207;

    @ObfuscatedName("bx.o")
    public class154 field1200;

    @ObfuscatedName("bx.i")
    public byte[] field1203 = new byte[4];

    @ObfuscatedName("bx.u")
    public DataInputStream field1209;

    @ObfuscatedName("bx.g")
    public int field1202;

    @ObfuscatedName("bx.m")
    public byte[] field1205;

    @ObfuscatedName("bx.s")
    public int field1206;

    @ObfuscatedName("bx.x")
    public long field1204;

    public class78(class155 arg0, URL arg1) {
        this.field1200 = arg0.method2637(arg1);
        this.field1207 = 0;
        this.field1204 = class176.method2679() + 30000L;
    }

    @ObfuscatedName("bx.c(I)[B")
    public byte[] method1358() throws IOException {
        if (class176.method2679() > this.field1204) {
            throw new IOException();
        }
        if (this.field1207 == 0) {
            if (this.field1200.field2189 == 2) {
                throw new IOException();
            }
            if (this.field1200.field2189 == 1) {
                this.field1209 = (DataInputStream) this.field1200.field2193;
                this.field1207 = 1;
            }
        }
        if (this.field1207 == 1) {
            this.field1202 += this.field1209.read(this.field1203, this.field1202, this.field1203.length - this.field1202);
            if (this.field1202 == 4) {
                int var1 = (new class174(this.field1203)).method2987();
                this.field1205 = new byte[var1];
                this.field1207 = 2;
            }
        }
        if (this.field1207 == 2) {
            this.field1206 += this.field1209.read(this.field1205, this.field1206, this.field1205.length - this.field1206);
            if (this.field1206 == this.field1205.length) {
                return this.field1205;
            }
        }
        return null;
    }
}
