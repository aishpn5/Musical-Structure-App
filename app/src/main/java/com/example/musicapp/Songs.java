package com.example.musicapp;

    /**
     * {@link Songs} represents a list of songs in English
     */
    public class Songs {

        /** song name  */
        private String mSong;

        /**name of singer */
        private String mSinger;

        /**
         * Create a new Songs object.
         *
         * @param Song represents the name of the English songs
         * @param Singer represents the name of the singer
         */
        public Songs(String Song, String Singer) {
            mSong = Song;
            mSinger = Singer;
        }

        /**
         * Get the name of the song
         */
        public String getSong() {
            return mSong;
        }

        /**
         * Get the name of the singer
         */
        public String getSinger() {
            return mSinger;
        }




    }
