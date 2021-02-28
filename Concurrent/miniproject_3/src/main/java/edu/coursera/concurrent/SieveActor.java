package edu.coursera.concurrent;

import edu.rice.pcdp.Actor;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * An actor-based implementation of the Sieve of Eratosthenes.
 *
 * TODO Fill in the empty SieveActorActor actor class below and use it from
 * countPrimes to determine the number of primes <= limit.
 */
public final class SieveActor extends Sieve {
    /**
     * {@inheritDoc}
     *
     * TODO Use the SieveActorActor class to calculate the number of primes <=
     * limit in parallel. You might consider how you can model the Sieve of
     * Eratosthenes as a pipeline of actors, each corresponding to a single
     * prime number.
     */

    private int MAX_PRIME = 0;

    @Override
    public int countPrimes(final int limit) {

        MAX_PRIME = limit;

        return 0;
    }

    /**
     * An actor class that helps implement the Sieve of Eratosthenes in
     * parallel.
     */
    public static final class SieveActorActor extends Actor {
        /**
         * Process a single message sent to this actor.
         *
         * TODO complete this method.
         *
         * @param msg Received message
         */

        private SieveActorActor nextActor = null;

        @Override
        public void process(final Object msg) {

            final int candidate = (Integer) msg;

            if (candidate <= 0) {
                if (nextActor != null) {
                    nextActor.send(msg);
                }
                System.exit(-1);

            } else {


            }
        }

        private boolean isPrimeNumber(int number) {

            return true;
        }
    }
}
