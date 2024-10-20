package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("es")
public final class class147 implements Runnable {

    @ObfuscatedName("es.i")
    public OutputStream field2239;

    @ObfuscatedName("es.h")
    public InputStream field2238;

    @ObfuscatedName("es.e")
    public Socket field2231;

    @ObfuscatedName("es.g")
    public boolean field2232 = false;

    @ObfuscatedName("es.n")
    public class140 field2230;

    @ObfuscatedName("es.u")
    public class150 field2234;

    @ObfuscatedName("es.d")
    public byte[] field2235;

    @ObfuscatedName("es.l")
    public int field2236 = 0;

    @ObfuscatedName("es.m")
    public int field2237 = 0;

    @ObfuscatedName("es.j")
    public boolean field2240 = false;

    public class147(Socket arg0, class140 arg1) throws IOException {
        this.field2230 = arg1;
        this.field2231 = arg0;
        this.field2231.setSoTimeout(30000);
        this.field2231.setTcpNoDelay(true);
        this.field2231.setReceiveBufferSize(16384);
        this.field2231.setSendBufferSize(16384);
        this.field2238 = this.field2231.getInputStream();
        this.field2239 = this.field2231.getOutputStream();
    }

    @ObfuscatedName("es.e(I)V")
    public void method2875() {
        if (this.field2232) {
            return;
        }
        synchronized (this) {
            this.field2232 = true;
            this.notifyAll();
        }
        if (this.field2234 != null) {
            while (this.field2234.field2266 == 0) {
                class131.method3297(1L);
            }
            if (this.field2234.field2266 == 1) {
                try {
                    ((Thread) this.field2234.field2271).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2234 = null;
    }

    public void finalize() {
        this.method2875();
    }

    @ObfuscatedName("es.g(B)I")
    public int method2871() throws IOException {
        return this.field2232 ? 0 : this.field2238.read();
    }

    @ObfuscatedName("es.n(I)I")
    public int method2872() throws IOException {
        return this.field2232 ? 0 : this.field2238.available();
    }

    @ObfuscatedName("es.u([BIII)V")
    public void method2873(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2232) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2238.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("es.d([BIIB)V")
    public void method2874(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2232) {
            return;
        }
        if (this.field2240) {
            this.field2240 = false;
            throw new IOException();
        }
        if (this.field2235 == null) {
            this.field2235 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2235[this.field2237] = arg0[arg1 + var5];
                this.field2237 = (this.field2237 + 1) % 5000;
                if ((this.field2236 + 4900) % 5000 == this.field2237) {
                    throw new IOException();
                }
            }
            if (this.field2234 == null) {
                this.field2234 = this.field2230.method2773(this, 3);
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
                        if (this.field2237 == this.field2236) {
                            if (this.field2232) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2236;
                        if (this.field2237 >= this.field2236) {
                            var4 = this.field2237 - this.field2236;
                        } else {
                            var4 = 5000 - this.field2236;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2239.write(this.field2235, var3, var4);
                    } catch (IOException var12) {
                        this.field2240 = true;
                    }
                    this.field2236 = (this.field2236 + var4) % 5000;
                    try {
                        if (this.field2237 == this.field2236) {
                            this.field2239.flush();
                        }
                    } catch (IOException var11) {
                        this.field2240 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2238 != null) {
                        this.field2238.close();
                    }
                    if (this.field2239 != null) {
                        this.field2239.close();
                    }
                    if (this.field2231 != null) {
                        this.field2231.close();
                    }
                } catch (IOException var10) {
                }
                this.field2235 = null;
                break;
            }
        } catch (Exception var15) {
            class152.method2021((String) null, var15);
        }
    }
}
