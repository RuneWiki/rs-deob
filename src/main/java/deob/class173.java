package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fv")
public final class class173 extends class169 implements Runnable {

    @ObfuscatedName("fv.b")
    public InputStream field2207;

    @ObfuscatedName("fv.q")
    public OutputStream field2205;

    @ObfuscatedName("fv.o")
    public Socket field2199;

    @ObfuscatedName("fv.p")
    public boolean field2200 = false;

    @ObfuscatedName("fv.a")
    public class166 field2201;

    @ObfuscatedName("fv.h")
    public class165 field2197;

    @ObfuscatedName("fv.l")
    public byte[] field2203;

    @ObfuscatedName("fv.y")
    public int field2204 = 0;

    @ObfuscatedName("fv.g")
    public int field2198 = 0;

    @ObfuscatedName("fv.c")
    public boolean field2206 = false;

    @ObfuscatedName("fv.u")
    public final int field2202;

    @ObfuscatedName("fv.r")
    public final int field2208;

    public class173(Socket arg0, class166 arg1, int arg2) throws IOException {
        this.field2201 = arg1;
        this.field2199 = arg0;
        this.field2202 = arg2;
        this.field2208 = arg2 - 100;
        this.field2199.setSoTimeout(30000);
        this.field2199.setTcpNoDelay(true);
        this.field2199.setReceiveBufferSize(65536);
        this.field2199.setSendBufferSize(65536);
        this.field2207 = this.field2199.getInputStream();
        this.field2205 = this.field2199.getOutputStream();
    }

    @ObfuscatedName("fv.h(B)V")
    public void method3020() {
        if (this.field2200) {
            return;
        }
        synchronized (this) {
            this.field2200 = true;
            this.notifyAll();
        }
        if (this.field2197 != null) {
            while (this.field2197.field2154 == 0) {
                class202.method141(1L);
            }
            if (this.field2197.field2154 == 1) {
                try {
                    ((Thread) this.field2197.field2158).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2197 = null;
    }

    public void finalize() {
        this.method3020();
    }

    @ObfuscatedName("fv.o(I)I")
    public int method3014() throws IOException {
        return this.field2200 ? 0 : this.field2207.read();
    }

    @ObfuscatedName("fv.q(B)I")
    public int method3028() throws IOException {
        return this.field2200 ? 0 : this.field2207.available();
    }

    @ObfuscatedName("fv.b(II)Z")
    public boolean method3024(int arg0) throws IOException {
        if (this.field2200) {
            return false;
        }
        try {
            return this.field2207.available() >= arg0;
        } catch (IOException var3) {
            throw new IOException("Error reading from clientstream", var3);
        }
    }

    @ObfuscatedName("fv.p([BIII)I")
    public int method3031(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2200) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2207.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fv.e([BIIB)V")
    public void method3040(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2200) {
            return;
        }
        if (this.field2206) {
            this.field2206 = false;
            throw new IOException();
        }
        if (this.field2203 == null) {
            this.field2203 = new byte[this.field2202];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2203[this.field2198] = arg0[arg1 + var5];
                this.field2198 = (this.field2198 + 1) % this.field2202;
                if ((this.field2208 + this.field2204) % this.field2202 == this.field2198) {
                    throw new IOException();
                }
            }
            if (this.field2197 == null) {
                this.field2197 = this.field2201.method2985(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2204 == this.field2198) {
                            if (this.field2200) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2204;
                        if (this.field2198 >= this.field2204) {
                            var4 = this.field2198 - this.field2204;
                        } else {
                            var4 = this.field2202 - this.field2204;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2205.write(this.field2203, var3, var4);
                    } catch (IOException var12) {
                        this.field2206 = true;
                    }
                    this.field2204 = (this.field2204 + var4) % this.field2202;
                    try {
                        if (this.field2204 == this.field2198) {
                            this.field2205.flush();
                        }
                    } catch (IOException var11) {
                        this.field2206 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2207 != null) {
                        this.field2207.close();
                    }
                    if (this.field2205 != null) {
                        this.field2205.close();
                    }
                    if (this.field2199 != null) {
                        this.field2199.close();
                    }
                } catch (IOException var10) {
                }
                this.field2203 = null;
                break;
            }
        } catch (Exception var15) {
            class164.method482((String) null, var15);
        }
    }

    @ObfuscatedName("fv.a([BIII)V")
    public void method3019(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3040(arg0, arg1, arg2);
    }
}
