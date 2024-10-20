package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("em")
public final class class143 implements Runnable {

    @ObfuscatedName("em.j")
    public InputStream field2193;

    @ObfuscatedName("em.l")
    public OutputStream field2186;

    @ObfuscatedName("em.a")
    public Socket field2188;

    @ObfuscatedName("em.i")
    public boolean field2185 = false;

    @ObfuscatedName("em.f")
    public class136 field2189;

    @ObfuscatedName("em.m")
    public class146 field2190;

    @ObfuscatedName("em.o")
    public byte[] field2194;

    @ObfuscatedName("em.h")
    public int field2192 = 0;

    @ObfuscatedName("em.n")
    public int field2187 = 0;

    @ObfuscatedName("em.k")
    public boolean field2195 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2189 = arg1;
        this.field2188 = arg0;
        this.field2188.setSoTimeout(30000);
        this.field2188.setTcpNoDelay(true);
        this.field2188.setReceiveBufferSize(16384);
        this.field2188.setSendBufferSize(16384);
        this.field2193 = this.field2188.getInputStream();
        this.field2186 = this.field2188.getOutputStream();
    }

    @ObfuscatedName("em.i(I)V")
    public void method2796() {
        if (this.field2185) {
            return;
        }
        synchronized (this) {
            this.field2185 = true;
            this.notifyAll();
        }
        if (this.field2190 != null) {
            while (this.field2190.field2223 == 0) {
                class127.method2202(1L);
            }
            if (this.field2190.field2223 == 1) {
                try {
                    ((Thread) this.field2190.field2224).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2190 = null;
    }

    public void finalize() {
        this.method2796();
    }

    @ObfuscatedName("em.f(I)I")
    public int method2777() throws IOException {
        return this.field2185 ? 0 : this.field2193.read();
    }

    @ObfuscatedName("em.m(B)I")
    public int method2788() throws IOException {
        return this.field2185 ? 0 : this.field2193.available();
    }

    @ObfuscatedName("em.o([BIII)V")
    public void method2779(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2185) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2193.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("em.h([BIIS)V")
    public void method2780(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2185) {
            return;
        }
        if (this.field2195) {
            this.field2195 = false;
            throw new IOException();
        }
        if (this.field2194 == null) {
            this.field2194 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2194[this.field2187] = arg0[arg1 + var5];
                this.field2187 = (this.field2187 + 1) % 5000;
                if ((this.field2192 + 4900) % 5000 == this.field2187) {
                    throw new IOException();
                }
            }
            if (this.field2190 == null) {
                this.field2190 = this.field2189.method2689(this, 3);
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
                        if (this.field2192 == this.field2187) {
                            if (this.field2185) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2192;
                        if (this.field2187 >= this.field2192) {
                            var4 = this.field2187 - this.field2192;
                        } else {
                            var4 = 5000 - this.field2192;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2186.write(this.field2194, var3, var4);
                    } catch (IOException var12) {
                        this.field2195 = true;
                    }
                    this.field2192 = (this.field2192 + var4) % 5000;
                    try {
                        if (this.field2192 == this.field2187) {
                            this.field2186.flush();
                        }
                    } catch (IOException var11) {
                        this.field2195 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2193 != null) {
                        this.field2193.close();
                    }
                    if (this.field2186 != null) {
                        this.field2186.close();
                    }
                    if (this.field2188 != null) {
                        this.field2188.close();
                    }
                } catch (IOException var10) {
                }
                this.field2194 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method181((String) null, var15);
        }
    }
}
