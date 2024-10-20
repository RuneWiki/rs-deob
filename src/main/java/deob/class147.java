package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eb")
public final class class147 implements Runnable {

    @ObfuscatedName("eb.x")
    public InputStream field2238;

    @ObfuscatedName("eb.r")
    public OutputStream field2235;

    @ObfuscatedName("eb.j")
    public Socket field2236;

    @ObfuscatedName("eb.z")
    public boolean field2234 = false;

    @ObfuscatedName("eb.i")
    public class140 field2244;

    @ObfuscatedName("eb.b")
    public class150 field2239;

    @ObfuscatedName("eb.l")
    public byte[] field2240;

    @ObfuscatedName("eb.m")
    public int field2241 = 0;

    @ObfuscatedName("eb.p")
    public int field2237 = 0;

    @ObfuscatedName("eb.f")
    public boolean field2242 = false;

    public class147(Socket arg0, class140 arg1) throws IOException {
        this.field2244 = arg1;
        this.field2236 = arg0;
        this.field2236.setSoTimeout(30000);
        this.field2236.setTcpNoDelay(true);
        this.field2236.setReceiveBufferSize(16384);
        this.field2236.setSendBufferSize(16384);
        this.field2238 = this.field2236.getInputStream();
        this.field2235 = this.field2236.getOutputStream();
    }

    @ObfuscatedName("eb.j(I)V")
    public void method2881() {
        if (this.field2234) {
            return;
        }
        synchronized (this) {
            this.field2234 = true;
            this.notifyAll();
        }
        if (this.field2239 != null) {
            while (this.field2239.field2267 == 0) {
                class131.method2672(1L);
            }
            if (this.field2239.field2267 == 1) {
                try {
                    ((Thread) this.field2239.field2271).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2239 = null;
    }

    public void finalize() {
        this.method2881();
    }

    @ObfuscatedName("eb.z(I)I")
    public int method2877() throws IOException {
        return this.field2234 ? 0 : this.field2238.read();
    }

    @ObfuscatedName("eb.i(I)I")
    public int method2878() throws IOException {
        return this.field2234 ? 0 : this.field2238.available();
    }

    @ObfuscatedName("eb.b([BIII)V")
    public void method2879(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2234) {
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

    @ObfuscatedName("eb.l([BIII)V")
    public void method2880(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2234) {
            return;
        }
        if (this.field2242) {
            this.field2242 = false;
            throw new IOException();
        }
        if (this.field2240 == null) {
            this.field2240 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2240[this.field2237] = arg0[arg1 + var5];
                this.field2237 = (this.field2237 + 1) % 5000;
                if ((this.field2241 + 4900) % 5000 == this.field2237) {
                    throw new IOException();
                }
            }
            if (this.field2239 == null) {
                this.field2239 = this.field2244.method2772(this, 3);
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
                        if (this.field2241 == this.field2237) {
                            if (this.field2234) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2241;
                        if (this.field2237 >= this.field2241) {
                            var4 = this.field2237 - this.field2241;
                        } else {
                            var4 = 5000 - this.field2241;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2235.write(this.field2240, var3, var4);
                    } catch (IOException var12) {
                        this.field2242 = true;
                    }
                    this.field2241 = (this.field2241 + var4) % 5000;
                    try {
                        if (this.field2241 == this.field2237) {
                            this.field2235.flush();
                        }
                    } catch (IOException var11) {
                        this.field2242 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2238 != null) {
                        this.field2238.close();
                    }
                    if (this.field2235 != null) {
                        this.field2235.close();
                    }
                    if (this.field2236 != null) {
                        this.field2236.close();
                    }
                } catch (IOException var10) {
                }
                this.field2240 = null;
                break;
            }
        } catch (Exception var15) {
            class152.method2217((String) null, var15);
        }
    }
}
