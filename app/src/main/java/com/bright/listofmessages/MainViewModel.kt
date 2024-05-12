package com.bright.listofmessages

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bright.listofmessages.model.Program
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _programs = MutableStateFlow(listOf<Program>())
    val programs = _programs.asStateFlow()

    init {
        viewModelScope.launch {
            _programs.emit(
                listOf(
                    Program(
                        "Bachelor of Applied Arts & Sciences",
                        "Through the Bachelor of Applied Arts & Sciences, you’ll gain a deep understanding of consciousness—through knowledge and experience—and how it enhances and connects different academic disciplines.\n" +
                                "\n" +
                                "Self-exploration is at the heart of the Bachelor of Applied Arts & Sciences. You’ll take courses available only at MIU including “Transcendental Meditation” and “Physiology is Consciousness.” You’ll also have a selection of special elective courses in the humanities, social sciences, and business.\n" +
                                "\n" +
                                "At MIU, self-discovery is not just an intellectual process. It’s the deep, direct experience of your own innermost nature and the underlying reality of life."
                    ),
                    Program(
                        "Bachelor’s Specialization in Ayurveda Wellness & Integrative Health",
                        "Our program integrates modern medicine and science with the natural approach of Ayurveda — and teaches you how to use them together to create optimal health.\n" +
                                "\n" +
                                "In the BA program, you’ll learn the basics of a range of natural therapeutic techniques, including:\n" +
                                "\n" +
                                "Optimal diet and routine for different individuals\n" +
                                "Beneficial herbal supplements for specific imbalances and organ systems\n" +
                                "Traditional purification therapies\n" +
                                "Principles of biological rhythms and their effects on health"
                    ),
                    Program(
                        "BS in Computer Science",
                        "Today’s society is increasingly information-based. Fundamental knowledge of how computers and computing systems work is a vital part of modern life and a universal skill that can be applied to a variety of careers and fields.\n" +
                                "\n" +
                                "Our computer science program will prepare you for success by providing comprehensive knowledge of the discipline and by teaching you how to think clearly, precisely, and creatively."
                    ),
                    Program(
                        "Master’s Degree in Computer Science",
                        "The Computer Professionals Program has been running for 27 years, and is one of the largest Master’s in Computer Science programs in the USA.  We encourage enrollment of U.S. and international students through four annual entries."
                    ),
                    Program(
                        "BA in Consciousness & Human Potential",
                        "The BA in Consciousness & Human Potential integrates personal experience, philosophy of mind, neuroscience, and ancient wisdom.\n" +
                                "\n" +
                                "Our goal for every student is enlightenment — the systematic development of full potential from within. This is the key to true fulfillment in daily life and any career."
                    ),
                    Program(
                        "Bachelor’s Specialization in Consciousness & Human Potential",
                        "The philosophy of Yoga as found in Maharishi’s commentary on the Bhagavad Gita and Patanjali’s Yoga Sutras, and how Yoga practice enhances your life\n" +
                                "How to accelerate personal growth through the Transcendental Meditation® technique, yoga asanas, retreats, and other practical approaches\n" +
                                "The latest scientific research on brain functioning and how meditation leads to clearer thinking\n" +
                                "Strategies for social transformation leading to a more peaceful world\n" +
                                "Modern perspectives on consciousness in the light of Maharishi Vedic Science"
                    ),
                    Program(
                        "Bachelor’s with Specialization in Positive Psychology & Consciousness",
                        "Throughout this program, you’ll explore what makes life fulfilling and meaningful. Learn about the latest scientific research on happiness, wellbeing, and higher states of consciousness, and discover how to easily live this knowledge and share it with others. Understanding the role of positive emotions, meaningful relationships, and the experience of transcending will give you valuable insights into what it takes to live a happy and fulfilling life."
                    ),
                    Program(
                        "BA in Enlightened Leadership", "Everyone is a leader. Including you.\n" +
                                "\n" +
                                "You may not have a formal title. You may not oversee a group of people in an organization.\n" +
                                "\n" +
                                "But you’re a leader in the example you set and in the responsibility you take. You lead in the way you influence others and how you make a difference in others’ lives. You lead as a friend, as a parent, as a member of a team. Throughout the day, in ways you may not even realize, you lead.\n" +
                                "\n" +
                                "Everyone is a leader, and everyone has the potential to become a more effective leader."
                    ),
                    Program(
                        "MA in Consciousness & Human Potential",
                        "Ancient and modern teachers looked within themselves to find answers to questions like: “Who am I?” “Where am I going?” “How can I become more creative and develop my full potential?” “How am I connected to everything around me?” and “What is the nature of this reality in which we live?”\n" +
                                "\n" +
                                "In this program, you’ll join the ranks of great thinkers to further humanity’s ever-evolving understanding of consciousness and human potential, and dive into a field of study that offers profound opportunities for self-discovery, transformation, and contributing to the greater good."
                    ),
                    Program(
                        "BA or BS — Individualized Major",
                        "With our Individualized Major, you’ll mold classes from our existing programs along with internship options into a one-of-a-kind degree that fulfills your own personal vision.\n" +
                                "\n" +
                                "Some Individualized Majors our students have designed include:\n" +
                                "\n" +
                                "Consciousness-Based Community Development\n" +
                                "Agro-ecology & Sustainability\n" +
                                "Creativity for Social Change\n" +
                                "You can also blend majors together to graduate sooner by focusing specifically on your area of interest. You’ll be guided through the creation process of your major by an academic advisor who will help you every step of the way."
                    ),
                    Program(
                        "BA in Regenerative Organic Agriculture",
                        "The ROA bachelor’s degree embraces a holistic, systems-based approach to farm management and ecological design that actively regenerates the environment and provides you with foundational knowledge in soil regeneration, water conservation, plant sciences, and permaculture design. The degree will prepare you for a career in consulting, farming, food entrepreneurship, and more."
                    ),
                    Program(
                        "English as a Second Language (ESL)",
                        "The program follows the innovative and effective Focal Skills Approach to English Language Acquisition. The Focal Skills Approach allows language skills to build on one another naturally in a series of sequenced learning modules. There are four learning modules:\n" +
                                "\n" +
                                "Focus on Listening\n" +
                                "Focus on Reading\n" +
                                "Focus on Writing\n" +
                                "Advanced Integration"
                    ),
                    Program(
                        "Bachelor’s with Specialization in Regenerative Organic Agriculture",
                        "Regenerative agriculture is a systems-based approach to agriculture that leverages natural ecology to build soil, improve water efficiency, and increase biodiversity while emphasizing healthy food, feed, and fiber as the foundation of a strong community."
                    ),
                    Program(
                        "BS in Mathematics",
                        "In our undergraduate program, you’ll connect mathematics in a meaningful way to your own life. You’ll see how each topic connects to your deepest self while growing as a mathematician and a person."
                    ),
                    Program(
                        "PhD in Management",
                        "Learn to research, measure and communicate business sustainability outcomes\n" +
                                "Grow holistically through daily practice of the Transcendental Meditation technique\n" +
                                "Develop leadership skills to help move organizations and the business world toward sustainable practices"
                    ),
                    Program(
                        "EdD in Transformational Leadership & Coaching",
                        "MIU offers one of the few doctoral-level coaching programs in the US that is recognized by the Graduate School Alliance for Education in Coaching (GSAEC) and is the only EdD that features Consciousness-Based Education.\n" +
                                "\n" +
                                "This program equips you with the advanced scholar practitioner skills needed to excel in diverse fields such as coaching, education, business, training, human services, or any field in which you are seeking greater influence and leadership. Throughout your doctoral journey, you’ll cultivate and apply these skills to inspire growth and excellence in both yourself and those you lead and coach."
                    )
                )
            )
        }

    }
}