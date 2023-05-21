<!-- PROJECT SHIELDS -->

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![Quality][quality-shield]][quality-url]

<!-- PROJECT LOGO -->
<!--suppress ALL -->
<br />
<p align="center">
  <a href="https://github.com/LeoMeinel/vitalseen">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>

<h3 align="center">VitalSeen</h3>

  <p align="center">
    See when player was last seen on Spigot and Paper
    <br />
    <a href="https://github.com/LeoMeinel/vitalseen"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/LeoMeinel/vitalseen">View Demo</a>
    ·
    <a href="https://github.com/LeoMeinel/vitalseen/issues">Report Bug</a>
    ·
    <a href="https://github.com/LeoMeinel/vitalseen/issues">Request Feature</a>
  </p>

<!-- ABOUT THE PROJECT -->

## About The Project

### Description

VitalSeen is a Plugin that gives players the ability to see when other players were last seen.

This plugin is perfect for any server wanting their players to keep in touch with others.

### Features

- See when player was last seen formatted as date

### Built With

- [Gradle 7](https://docs.gradle.org/7.5.1/release-notes.html)
- [OpenJDK 17](https://openjdk.java.net/projects/jdk/17/)

<!-- GETTING STARTED -->

## Getting Started

To get the plugin running on your server follow these simple steps.

### Commands and Permissions

1. Permission: `vitalseen.seen`

- Command: `/seen <player>`
- Description: See last time a player was online

### Configuration - messages.yml

```yaml
last-seen: "&b%player% &fwas last seen on &b%last-seen%"
no-perms: "&cYou don't have enough permissions!"
invalid-player: "&cPlayer is not registered!"
same-player: "&cYou can't use that on yourself!"
```

<!-- ROADMAP -->

## Roadmap

See the [open issues](https://github.com/LeoMeinel/vitalseen/issues) for a list of proposed features (and known
issues).

<!-- CONTRIBUTING -->

## Contributing

Contributions are what make the open source community such an amazing place to be, learn, inspire, and create. Any
contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- LICENSE -->

## License

Distributed under the GNU General Public License v3.0. See `LICENSE` for more information.

<!-- CONTACT -->

## Contact

Leopold Meinel - [leo@meinel.dev](mailto:leo@meinel.dev) - eMail

Project Link - [VitalSeen](https://github.com/LeoMeinel/vitalseen) - GitHub

<!-- ACKNOWLEDGEMENTS -->

### Acknowledgements

- [README.md - othneildrew](https://github.com/othneildrew/Best-README-Template)

<!-- MARKDOWN LINKS & IMAGES -->

[contributors-shield]: https://img.shields.io/github/contributors-anon/LeoMeinel/vitalseen?style=for-the-badge
[contributors-url]: https://github.com/LeoMeinel/vitalseen/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/LeoMeinel/vitalseen?label=Forks&style=for-the-badge
[forks-url]: https://github.com/LeoMeinel/vitalseen/network/members
[stars-shield]: https://img.shields.io/github/stars/LeoMeinel/vitalseen?style=for-the-badge
[stars-url]: https://github.com/LeoMeinel/vitalseen/stargazers
[issues-shield]: https://img.shields.io/github/issues/LeoMeinel/vitalseen?style=for-the-badge
[issues-url]: https://github.com/LeoMeinel/vitalseen/issues
[license-shield]: https://img.shields.io/github/license/LeoMeinel/vitalseen?style=for-the-badge
[license-url]: https://github.com/LeoMeinel/vitalseen/blob/main/LICENSE
[quality-shield]: https://img.shields.io/codefactor/grade/github/LeoMeinel/vitalseen?style=for-the-badge
[quality-url]: https://www.codefactor.io/repository/github/LeoMeinel/vitalseen
